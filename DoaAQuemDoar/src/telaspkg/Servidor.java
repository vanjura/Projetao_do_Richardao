/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaspkg;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static org.json.JSONObject.NULL;
import server.Server;
import server.Usuario;
import javax.swing.JTextPane;

/**
 *
 * @author Jhonatan
 */
public class Servidor extends javax.swing.JFrame {

    Thread mainThread;
    boolean conectado = false;
    private Socket clientSocket;
    private ServerSocket serverSocket = null;
    public ArrayList<Usuario> clientes = new ArrayList<Usuario>();

    private Servidor(Socket clientSoc) {
        clientSocket = clientSoc;

        run();
    }

    /**
     * Creates new form Servidor
     */
    public Servidor() {
        initComponents();
        addTexto(jTextPane1, "Log - DoaAQuemDoar", Color.MAGENTA);
    }

    public void addTexto(JTextPane textPane, String frase, Color cor) {
        StyledDocument doc = textPane.getStyledDocument();
        Style style = textPane.addStyle("I'm a Style", null);

        try {
            StyleConstants.setForeground(style, cor);
            doc.insertString(doc.getLength(), frase + "\n", style);
            textPane.setCaretPosition(textPane.getDocument().getLength());
        } catch (Exception e) {
            textPane.setText(textPane.getText() + frase);
        }
    }

    public void run() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jButtonDesconectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Porta", "Nome", "Tipo", "Material"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(UserTable);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 280));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 310));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log do Sistema"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setAutoscrolls(true);

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 140));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 890, 170));

        jLabel1.setText("Porta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jTextFieldPorta.setText("1234");
        jTextFieldPorta.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextFieldPorta.setPreferredSize(new java.awt.Dimension(100, 20));
        jTextFieldPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPortaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 20));

        jButtonDesconectar.setText("Desconectar");
        jButtonDesconectar.setEnabled(false);
        jButtonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPortaActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        jButtonConectar.setEnabled(false);
        jTextFieldPorta.setEnabled(false);
        mainThread = new Thread() {
            @Override
            public void run() {
                try {
                    iniciaServidor();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        this.mainThread.start();
        jButtonDesconectar.setEnabled(true);
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed
        desconectaServidor();
        JOptionPane.showConfirmDialog(null, "Servidor desconectado!", "Desconectado", JOptionPane.DEFAULT_OPTION);
        jButtonConectar.setEnabled(true);
        jButtonDesconectar.setEnabled(false);
        jTextFieldPorta.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        //System.exit(0);
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserTable;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private void iniciaServidor() throws IOException {
        try {
            serverSocket = new ServerSocket(Integer.parseInt(jTextFieldPorta.getText()));
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showConfirmDialog(null, "Conexão criada com sucesso", "Conexão", JOptionPane.DEFAULT_OPTION);
        addTexto(jTextPane1, "Servidor iniciado em: " + Inet4Address.getLocalHost().getHostAddress() + ":" + serverSocket.getLocalPort(), Color.blue);
        System.out.println("Conexao Criada");
        conectado = true;
        while (conectado == true) {
            try {
                System.out.println("Entrou no while maior.");
                clientSocket = serverSocket.accept();
                System.out.println("Novo Cliente");
                userLog(clientSocket.getPort(), nomeSocket(clientSocket), "Iniciou conexão.");
                BufferedReader read = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                new Thread() {
                    @Override
                    public void run() {
                        Socket socket = clientSocket;
                        try {
                            String linha;
                            while ((linha = read.readLine()) != null) {
                                System.out.println("Entrou no while menor.");
                                System.out.println(socket.getPort() + ": " + linha);
                                try {
                                    JSONObject json = new JSONObject(linha);
                                    System.out.println("Iniciando ação.");
                                    iniciaAcao(json, socket);
                                } catch (JSONException ex) {
                                    errorLog("JSON INVÀLIDO.", socket.getPort(), ex.getMessage());
                                    desconecta(socket);
                                }
                                System.out.println("Saiu do while menor.");
                            }
                            desconecta(socket);
                        } catch (IOException ex) {
                            desconecta(socket);
                        }
                    }
                }.start();
                System.out.println("Saiu do while maior.");
            } catch (SocketException e) {
                System.out.println("Socket error");
                break;
            }

        }
        System.out.println("Cabou");
    }

    private void serverLog(String frase) {
        String mensagem = "Server: " + frase;
        addTexto(jTextPane1, mensagem, Color.BLUE);
    }

    private void userLog(int porta, String nome, String frase) {
        String mensagem = "";
        if (nome != "") {
            mensagem = nome + " - " + porta + ": " + frase;
        } else {
            mensagem = porta + ": " + frase;
        }
        addTexto(jTextPane1, mensagem, Color.GREEN.darker().darker());
    }

    private void errorLog(String frase, int porta, String erro) {
        addTexto(jTextPane1, porta + " ERRO: " + frase + "\n" + erro, Color.red);
    }

    private void log(String pre, String frase, String cor) {
        System.out.println("LOG");
    }

    private void desconecta(Socket socket) {

        int porta = socket.getPort();
        try {
            for (int i = 0; i < clientes.size(); i++) {
                if (Integer.parseInt(clientes.get(i).getPorta()) == porta) {
                    System.out.println(clientes.get(i));
                    JSONObject json = new JSONObject();
                    json.put("action", "chat_general_client");
                    json.put("mensagem", clientes.get(i).getNome() + " desconectou-se.");
                    clientes.remove(i);
                    broadcast(json);
                    System.out.println("Desconectou " + socket.getPort());
                }
            }
            listaUsuarios();
            enviaMensagemParaCliente(socket, "desconecta");
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }
    }

    private void desconectaServidor() {
        try {
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < clientes.size(); i++) {
                Usuario cliente = clientes.get(i);
                Socket socket = cliente.getSocket();
                desconecta(socket);
            }
            serverSocket.close();
            conectado = false;
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }
    }

    private void enviaMensagemParaCliente(Socket socket, String mensagem) {
        PrintStream ps;
        try {
            ps = new PrintStream(socket.getOutputStream());
            ps.println(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            desconecta(socket);
            errorLog("Erro ao mandar mensagem.Encerrando conexão com "
                    + clientSocket.getInetAddress().getHostAddress()
                    + ":" + clientSocket.getPort()
                    + " por segurança.", socket.getPort(), ex.getMessage());
        }
    }

    private void iniciaAcao(JSONObject json, Socket socket) {
        if (json.has("action")) {
            if (json.get("action").equals("connect")) {
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'connect'.");
                iniciaConexao(json, socket);
            } else if (json.get("action").equals("disconnect")) {
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'disconnect'.");
                desconecta(socket);
            } else if (json.get("action").equals("chat_general_server")) {
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'chat_general_server'.");
                String nome = nomeSocket(socket);
                json.put("action", "chat_general_client");
                String msg = json.getString("mensagem");
                json.put("mensagem", nome + ": " + msg);
                serverLog("Enviando mensagem para chat geral - " + msg);
                broadcast(json);
            } else if (json.get("action").equals("chat_room_server")) {
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'chat_room_server'.");
                String nome = nomeSocket(socket);
                json.put("action", "chat_room_client");
                String msg = json.getString("mensagem");
                json.put("mensagem", nome + ": " + msg);
                mensagemTipo(json, socket, msg);
            } else {
                System.out.println("A ação " + json.get("action") + " não existe.");
            }
        } else {
        }
    }

    private void mensagemTipo(JSONObject json, Socket socket, String msg) {
        String tipo = tipoSocket(socket);
        System.out.println(tipo);
        if(tipo.equals("C")){
            serverLog("Enviando mensagem para chat Coletor - " + msg);
            json.put("mensagem", "COLETORES - " + json.getString("mensagem"));
        }else{
            serverLog("Enviando mensagem para chat Doador - " + msg);
            json.put("mensagem", "DOADORES - " + json.getString("mensagem"));
        }
        PrintStream ps;
        if (!tipo.equals("")) {
            try {
                for (int i = 0; i < clientes.size(); i++) {
                    Usuario usuario = clientes.get(i);
                    System.out.println(usuario.getTipo());
                    if(usuario.getTipo().equals(tipo)){
                        ps = new PrintStream(usuario.getSocket().getOutputStream());
                        ps.println(json.toString());
                    }
                }
            } catch (Exception e) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private String tipoSocket(Socket socket) {
        System.out.println("Procurando tipo..");
        try {
            for (int i = 0; i < clientes.size(); i++) {
                Usuario usuario = clientes.get(i);
                System.out.println(usuario.getTipo());
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    System.out.println("Achou o tipo " + usuario.getTipo());
                    return usuario.getTipo();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    private String nomeSocket(Socket socket) {
        System.out.println("Procurando nome..");
        try {
            for (int i = 0; i < clientes.size(); i++) {
                Usuario usuario = clientes.get(i);
                System.out.println(usuario.getNome());
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    System.out.println("Achou o nome " + usuario.getNome());
                    return usuario.getNome();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    private void iniciaConexao(JSONObject json, Socket socket) {
        Usuario usuario = validaUsuario(json, socket);
        userLog(socket.getPort(), "", "Entrou com o nome " + usuario.getNome());
        userLog(socket.getPort(), "", "endereço - " + usuario.getIp() + ":" + usuario.getPorta());
        atualizalista(usuario, "add");
        listaUsuarios();
    }

    private void atualizalista(Usuario usuario, String acao) {
        if (acao.equals("add")) {
            clientes.add(usuario);
        }
        JSONObject json = new JSONObject();
        json.put("action", "chat_general_client");
        json.put("mensagem", usuario.getNome() + " conectou-se.");
        broadcast(json);
        System.out.println("Conectou " + usuario.getPorta());
    }

    private void listaUsuarios() {
        serverLog("Arrumando lista de usuários...");
        JSONArray arr = new JSONArray();
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        try {
            for (int i = 0; i < clientes.size(); i++) {
                Usuario usuario = clientes.get(i);
                serverLog("Listando " + usuario.getNome() + " porta " + usuario.getPorta());
                String tipo;
                if (usuario.getTipo().equals("D")) {
                    tipo = "Doador";
                } else {
                    tipo = "Coletor";
                }
                model.addRow(new Object[]{usuario.getIp(), usuario.getPorta(), usuario.getNome(), tipo, usuario.getMaterial()});
                JSONObject newJson = usuario.getJson();
                newJson.put("porta", usuario.getPorta());
                newJson.remove("action");
                usuario.setJson(newJson);
                arr.put(usuario.getJson());
            }
        } catch (Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }

        JSONObject lista = new JSONObject();
        lista.put("action", "client_list");
        lista.put("lista", arr);
        broadcast(lista);
    }

    public void broadcast(JSONObject json) {
        for (int i = 0; i < clientes.size(); i++) {
            Usuario usuario = clientes.get(i);
            PrintStream ps;
            try {
                ps = new PrintStream(usuario.getSocket().getOutputStream());
                ps.println(json.toString());
            } catch (IOException ex) {

                System.err.println("Erro de broadcast: " + ex.getMessage());
            }
        }
    }

    private Usuario validaUsuario(JSONObject json, Socket socket) {
        Usuario usuario = new Usuario();
        usuario.setSocket(socket);
        usuario.setJson(json);
        if (json.has("nome") || json.has("tipo") || json.has("material")) {
            usuario.setNome(json.getString("nome"));
            usuario.setTipo(json.getString("tipo"));
            usuario.setMaterial(json.getString("material"));
            usuario.setIp(socket.getInetAddress().getHostAddress());
            usuario.setPorta(Integer.toString(socket.getPort()));
            if (json.get("tipo").equals("D")) {
                if (json.has("descricao")) {
                    usuario.setDescricao(json.getString("descricao"));
                }
            }
        }
        return usuario;
    }

//    private Runnable secondThread() {
//        Runnable second;
//        second = new Runnable() {
//            public void run() {
//                try {
//                    Usuario user = new Usuario();
//                    user.setSocket(clientSocket);
//                    user.setIn(new BufferedReader(new InputStreamReader(clientSocket.getInputStream())));
//                    user.setOut(new PrintStream(clientSocket.getOutputStream()));
//                    String line;
//                    while ((line = user.getIn().readLine()) != null) {
//                        JSONObject json = new JSONObject(line);
//                        if (json.has("action")) {
//                            System.out.println(json.get("action"));
//                            if (json.get("action").equals("connect")) {
//                                TextLog.append(
//                                        "Nova conexão iniciada: "
//                                        + user.getSocket().getInetAddress().getHostAddress()
//                                        + ":"
//                                        + user.getSocket().getPort()
//                                );
//                            } else {
//                                TextLog.append("A ação " + json.get("action") + " não está configurada.");
//                            }
//                        } else {
//                            TextLog.append("Tentativa incorreta de conexão. Action não foi detectada.");
//                        }
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//                try {
//                    serverSocket.close();
//                } catch (IOException e) {
//                    System.err.println("Não é possível fechar a porta.");
//                    System.exit(1);
//                }
//            }
//        };
//        return second;
//    }
}
