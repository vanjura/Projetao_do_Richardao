/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaspkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import server.Server;
import server.Usuario;

/**
 *
 * @author Jhonatan
 */
public class Servidor extends javax.swing.JFrame {

    Thread mainThread;
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
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextLog = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Nome", "Tipo", "Material"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 280));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 310));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log do Sistema"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextLog.setEditable(false);
        TextLog.setColumns(20);
        TextLog.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        TextLog.setRows(5);
        TextLog.setText("Log - DoaAQuemDoar\n");
        jScrollPane1.setViewportView(TextLog);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 140));

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
    }//GEN-LAST:event_jButtonConectarActionPerformed

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
    private javax.swing.JTextArea TextLog;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldPorta;
    // End of variables declaration//GEN-END:variables

    private void iniciaServidor() throws IOException {
        try {
            serverSocket = new ServerSocket(Integer.parseInt(jTextFieldPorta.getText()));
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showConfirmDialog(null, "Conexão criada com sucesso", "Conexão", JOptionPane.DEFAULT_OPTION);
        TextLog.append("\nServidor iniciado na porta " + serverSocket.getLocalPort());
        System.out.println("Conexao Criada");
        while (true) {
            System.out.println("Aguardando por conexão");
            clientSocket = serverSocket.accept();
            System.out.println("Nova Conexão Realizada");
            //new Thread(secondThread()).start();

            //novo
            BufferedReader read = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            new Thread() {
                @Override
                public void run() {
                    try {
                        String linha;
                        while ((linha = read.readLine()) != null) {
                            System.out.println("Entrou no while");
                            System.out.println(linha);
                            try {
                                JSONObject json = new JSONObject(linha);
                                iniciaAcao(json, clientSocket);
                                
                            } catch (JSONException ex) {
                                errorLog(
                                        "Json inválido - " + linha,
                                        ex.getMessage(),
                                        "Encerrando conexão com " + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort() + " por segurança.");
                                System.out.println("Erro json: " + ex.getMessage());
                                desconecta(clientSocket);
                            }
                            System.out.println("terminou o while");
                        }
                        desconecta(clientSocket);
                    } catch (IOException ex) {
                        System.err.println("Problema detectado: " + ex.getMessage());
                        desconecta(clientSocket);
                    }
                }
            }.start();
        }
    }

    private void errorLog(String frase, String erro, String fraseFinal) {
        TextLog.append("\n\n");
        TextLog.append("Erro: " + frase);
        TextLog.append("\n" + erro);
        TextLog.append("\n" + fraseFinal);
        TextLog.setCaretPosition(TextLog.getDocument().getLength());
    }

    private void desconecta(Socket socket) {
        int porta = socket.getPort();
        try{
            for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getPorta() == porta) {
                System.out.println(clientes.get(i));
                clientes.remove(i);
                System.out.println("Desconectou " + socket.getPort());
            }
        }
        }catch(Exception e){
            System.out.println("Erro" + e);
        }
        
        listaUsuarios();
        enviaMensagemParaCliente(socket, "desconecta");
    }
    
    private void enviaMensagemParaCliente(Socket socket, String mensagem){
        PrintStream ps;
        try {
            ps = new PrintStream(socket.getOutputStream());
            ps.println(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            desconecta(socket);
            errorLog(
                "Erro ao mandar mensagem.",
                ex.getMessage(),
                "Encerrando conexão com " + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort() + " por segurança.");
        }
    }

    private void iniciaAcao(JSONObject json, Socket socket) {
        System.out.println("Verificando ação...");
        if (json.has("action")) {
            if (json.get("action").equals("connect")) {
                iniciaConexao(json, socket);
            } else {
                System.out.println("A ação " + json.get("action") + " não existe.");
            }
        } else {
            System.out.println("Action não encontrada.");
        }
    }

    private void iniciaConexao(JSONObject json, Socket socket) {
        Usuario usuario = validaUsuario(json, socket);
        TextLog.append("\n\nNovo usuário: " + usuario.getNome() + "\nEndereço: ");
        TextLog.append(usuario.getIp() + ":" + usuario.getPorta());
        atualizalista(usuario, "add");
        listaUsuarios();
    }

    private void atualizalista(Usuario usuario, String acao) {
        if (acao.equals("add")) {
            clientes.add(usuario);
        }
    }

    private void listaUsuarios() {
        JSONArray arr = new JSONArray();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (int i = 0; i < clientes.size(); i++) {
            Usuario usuario = clientes.get(i);
            model.addRow(new Object[]{usuario.getIp(), usuario.getNome(), usuario.getMaterial(), usuario.getTipo()});
            JSONObject newJson = usuario.getJson();
            newJson.put("porta", usuario.getPorta());
            usuario.setJson(newJson);
            System.out.println(usuario.getJson());
            arr.put(usuario.getJson());
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
            usuario.setPorta(socket.getPort());
            if (json.get("tipo").equals("D")) {
                if (json.has("descricao")) {
                    usuario.setDescricao(json.getString("descricao"));
                }
            }
        }
        return usuario;
    }

    private Runnable secondThread() {
        Runnable second;
        second = new Runnable() {
            public void run() {
                try {
                    Usuario user = new Usuario();
                    user.setSocket(clientSocket);
                    user.setIn(new BufferedReader(new InputStreamReader(clientSocket.getInputStream())));
                    user.setOut(new PrintStream(clientSocket.getOutputStream()));
                    String line;
                    while ((line = user.getIn().readLine()) != null) {
                        JSONObject json = new JSONObject(line);
                        if (json.has("action")) {
                            System.out.println(json.get("action"));
                            if (json.get("action").equals("connect")) {
                                TextLog.append(
                                        "Nova conexão iniciada: "
                                        + user.getSocket().getInetAddress().getHostAddress()
                                        + ":"
                                        + user.getSocket().getPort()
                                );
                            } else {
                                TextLog.append("A ação " + json.get("action") + " não está configurada.");
                            }
                        } else {
                            TextLog.append("Tentativa incorreta de conexão. Action não foi detectada.");
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Não é possível fechar a porta.");
                    System.exit(1);
                }
            }
        };
        return second;
    }
}
