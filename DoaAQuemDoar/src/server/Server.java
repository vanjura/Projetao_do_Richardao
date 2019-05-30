/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Server extends Thread {

    private static int porta = 1234;
    private HashMap<Integer, Usuario> clientes = new HashMap<Integer, Usuario>();

    public Server() {
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        serverSocket = new ServerSocket(porta);
        Server server = new Server();
        System.out.println("Servidor iniciado");
        while (true) {
            System.out.println("Aguardando por conexão");
            Socket socket = serverSocket.accept();
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            new Thread() {
                @Override
                public void run() {
                    try {
                        String linha;
                        while ((linha = read.readLine()) != null) {
                            JSONObject json = new JSONObject(linha);
                            server.handleActions(json, socket);
                        }
                        server.desconecta(socket);
                    } catch (IOException ex) {
                        System.err.println("Problem with Communication Server: " + ex.getMessage());
                        server.desconecta(socket);
                    }
                }

            }.start();
        }
    }

    private void handleActions(JSONObject json, Socket socket) {
        if (json.has("action") && !json.getString("action").equalsIgnoreCase("")) {
            switch (json.getString("action")) {
                case "connect":
                    conecta(json, socket);
                    break;
                case "disconnect":
                    desconecta(socket);
                    break;
            }
        }
    }

    private void conecta(JSONObject json, Socket socket) {
        Usuario user = new Usuario();
        user.setNome(json.getString("nome"));
        user.setTipo(json.getString("tipo"));
        user.setMaterial(json.getString("material"));
        if (json.getString("tipo").equals("D")) {
            user.setDescricao(json.getString("descricao"));
        }

        clientes.put(socket.getPort(), user);
        atualizaLista();
    }

    private void desconecta(Socket socket) {
        clientes.remove(socket.getPort());
        atualizaLista();
    }

    private void atualizaLista() {
        JSONArray arr = new JSONArray();
        for (int i = 0; i < clientes.size(); i++) {
            Usuario u = clientes.get(i);
            arr.put(u.getJson());
        }

        JSONObject root = new JSONObject();
        root.put("action", "client_list");
        root.put("lista", arr);
        broadcast(root);
    }

    private void broadcast(JSONObject json) {
        for (int i = 0; i < clientes.size(); i++) {
            Usuario u = clientes.get(i);
            PrintStream ps;
            try {
                ps = new PrintStream(u.getSocket().getOutputStream());
                ps.println(json.toString());
            } catch (IOException ex) {
                System.err.println("Erro de broadcast: " + ex.getMessage());
            }
        }
    }
}
