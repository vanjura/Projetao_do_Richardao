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


public class Server extends Thread {

    protected Socket clientSocket;
    private static int porta;
    public ArrayList<Usuario> clientes = new ArrayList<Usuario>();
    

    public Server(Socket clientSoc) {
        clientSocket = clientSoc;
        start();
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Conexao Criada");
            try {
                while (true) {
                    System.out.println("Aguardando por conexão");
                    new Server(serverSocket.accept());
                }
            } catch (IOException e) {
                System.err.println("Falha na conexão");
                System.exit(1);
            }
        } catch (IOException e) {
            System.err.println("Não é possível ler a porta 10008.");
            System.exit(1);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                System.err.println("Não é possível fechar a porta 10008.");
                System.exit(1);
            }
        }
    }

    public void run() {
        System.out.println("Nova Conexão Realizada");

        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
                    true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String linha;

            while ((linha = in.readLine()) != null) {
                out.println(linha);
                System.out.println(linha);
                JSONObject json = new JSONObject(linha);
            }
            

            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("Problem with Communication Server");
            System.exit(1);
        }
    }

}
