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
import java.util.Iterator;
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
import javax.swing.SwingUtilities;

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
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Porta", "Nome", "Tipo", "Material", "Ocupado", "Falando Com"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jButton2.setText("Desconectar Client");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 20));

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
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed
        desconectaServidor();
        JOptionPane.showConfirmDialog(null, "Servidor desconectado!", "Desconectado", JOptionPane.DEFAULT_OPTION);
        jButtonConectar.setEnabled(true);
        jButtonDesconectar.setEnabled(false);
        jButton2.setEnabled(false);
        jTextFieldPorta.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        //System.exit(0);
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int column = 1;
            int row = UserTable.getSelectedRow();
            String porta = UserTable.getModel().getValueAt(row, column).toString();

            Object[] options = {"Sim", "Não"};
            int opcao = JOptionPane.showOptionDialog(null, "Deseja realmente desconecta este usuário?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (opcao == JOptionPane.YES_OPTION) {
                for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                    Usuario usuario = i.next();
                    if (porta.equals(usuario.getPorta())) {
                        desconecta(usuario.getSocket());
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário na tabela primeiro.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
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
        conectado = true;
        while (conectado == true) {
            try {
                clientSocket = serverSocket.accept();
                userLog(clientSocket.getPort(), nomeSocket(clientSocket), "Iniciou conexão.");
                BufferedReader read = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                new Thread() {
                    @Override
                    synchronized public void run() {
                        Socket socket = clientSocket;
                        try {
                            String linha;
                            while ((linha = read.readLine()) != null) {
                                try {
                                    JSONObject json = new JSONObject(linha);
                                    iniciaAcao(json, socket);
                                } catch (JSONException ex) {
                                    errorLog("Usuário Desconectado.", socket.getPort(), "Desconectado com sucesso.");
                                    desconecta(socket);
                                }
                            }
                            desconecta(socket);
                        } catch (IOException ex) {
                            desconecta(socket);
                        }
                    }
                }.start();
            } catch (SocketException e) {
                break;
            }

        }
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
        addTexto(jTextPane1, porta + " AVISO: " + frase + "\n" + erro, Color.YELLOW.darker().darker());
    }

    private void log(String pre, String frase, String cor) {
        System.out.println("LOG");
    }

    synchronized private void desconecta(Socket socket) {
        int porta = socket.getPort();
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                if (Integer.parseInt(usuario.getPorta()) == porta) {
                    JSONObject json = new JSONObject();
                    json.put("action", "chat_general_client");
                    json.put("mensagem", usuario.getNome() + " desconectou-se.");
                    i.remove();
                    broadcast(json);
                }
            }
        } catch (Exception e) {
            errorLog("Problema na desconexão.", porta, e.getMessage());
        }
        listaUsuarios();
    }

    synchronized private void desconectaServidor() {
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                Socket socket = usuario.getSocket();
                desconecta(socket);
                serverSocket.close();
            }
        } catch (Exception e) {
            errorLog("Desconexão falhou.", 0, e.getMessage());
        }
        conectado = false;
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

    synchronized private void iniciaAcao(JSONObject json, Socket socket) {
        System.out.println("Recebido: " + json);
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
                json.put("mensagem", nome + " (geral): " + msg);
                serverLog("Enviando mensagem para chat geral - " + msg);
                broadcast(json);
            } else if (json.get("action").equals("chat_room_server")) {
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'chat_room_server'.");
                String nome = nomeSocket(socket);
                json.put("action", "chat_room_client");
                String msg = json.getString("mensagem");
                mensagemMaterial(json, socket, msg, nome);
            } else if (json.get("action").equals("chat_request_server")) {
                chat_request_server(json, socket);
                userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'chat_request_server'.");
                String porta = portaSocket(socket);
                String nome = nomeSocket(socket);
                json.put("action", "chat_request_client");
                String msg = json.getString("mensagem");
                
                mensagemMaterial(json, socket, msg, nome);
            } else {
                System.out.println("A ação " + json.get("action") + " não existe.");
            }
        } else {
        }
    }

    private void chat_request_server(JSONObject json, Socket socket) {
        String porta = Integer.toString(socket.getPort());
        userLog(socket.getPort(), nomeSocket(socket), "Requisitou a ação 'chat_request_server'.");
        if (json.getString("destinatario").equals(porta)) {
            JSONObject response = new JSONObject();
            response.put("action", "request_error");
            errorLog("Remetente é igual ao usuário que requisitou.", socket.getPort(), "");
            try {
                PrintStream ps;
                ps = new PrintStream(socket.getOutputStream());
                ps.println(response.toString());
            } catch (Exception e) {
                errorLog("Erro ao enviar resposta.", socket.getPort(), e.getMessage());
            }
        } else {
            JSONObject response = new JSONObject();
            response.put("action", "chat_request_client");
            response.put("remetente", porta);
            Socket socketdest = getSocketWithPorta(json.getInt("destinatario"));
            try {
                PrintStream ps = new PrintStream(socketdest.getOutputStream());
                ps.println(response.toString());
            } catch (Exception e) {
                errorLog("Erro ao enviar resposta.", socket.getPort(), e.getMessage());
            }
        }

    }

    synchronized private Socket getSocketWithPorta(int porta) {
        for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
            Usuario usuario = i.next();
            if (Integer.toString(porta) == usuario.getPorta()) {
                return usuario.getSocket();
            }
        }
        return null;
    }

    synchronized private void mensagemMaterial(JSONObject json, Socket socket, String msg, String nome) {

        String material = materialSocket(socket);
        String tipo = tipoSocket(socket);
        if (tipo.equals("C")) {
            json.put("mensagem", nome + " (coletor de " + material + "): " + msg);
        } else {
            json.put("mensagem", nome + " (doador de " + material + "): " + msg);
        }
        System.out.println("Multicast: " + json);
        serverLog("Enviando mensagem chat material " + material.toUpperCase() + "/" + tipo + " - " + json.getString("mensagem"));
        if (!material.equals("")) {
            try {
                for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                    Usuario usuario = i.next();
                    if (usuario.getMaterial().equals(material)) {
                        PrintStream ps;
                        ps = new PrintStream(usuario.getSocket().getOutputStream());
                        ps.println(json.toString());
                    }
                }
            } catch (Exception e) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    synchronized private void mensagemUnicast(JSONObject json, Socket socket, String msg, String nome) {

        String material = materialSocket(socket);
        String tipo = tipoSocket(socket);
        if (tipo.equals("C")) {
            json.put("mensagem", nome + " (coletor de " + material + "): " + msg);
        } else {
            json.put("mensagem", nome + " (doador de " + material + "): " + msg);
        }
        System.out.println("Unicast: " + json);
        serverLog("Enviando mensagem chat privado " + material.toUpperCase() + "/" + tipo + " - " + json.getString("mensagem"));
        if (!material.equals("")) {
            try {
                for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                    Usuario usuario = i.next();
                    if (usuario.getMaterial().equals(material)) {
                        PrintStream ps;
                        ps = new PrintStream(usuario.getSocket().getOutputStream());
                        ps.println(json.toString());
                    }
                }
            } catch (Exception e) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    synchronized private String tipoSocket(Socket socket) {
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    return usuario.getTipo();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    synchronized private String materialSocket(Socket socket) {
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    return usuario.getMaterial();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    synchronized private String nomeSocket(Socket socket) {
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    return usuario.getNome();
                }
            }
        } catch (Exception e) {
            errorLog("Erro ao conseguir nome.", socket.getPort(), e.getMessage());
        }
        return "";
    }
    
    synchronized private String portaSocket(Socket socket) {
        try {
            for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                Usuario usuario = i.next();
                if (Integer.parseInt(usuario.getPorta()) == socket.getPort()) {
                    return usuario.getPorta();
                }
            }
        } catch (Exception e) {
            errorLog("Erro ao conseguir nome.", socket.getPort(), e.getMessage());
        }
        return "";
    }

    synchronized private void iniciaConexao(JSONObject json, Socket socket) {
        Usuario usuario = validaUsuario(json, socket);
        userLog(socket.getPort(), "", "Entrou com o nome " + usuario.getNome());
        userLog(socket.getPort(), "", "endereço - " + usuario.getIp() + ":" + usuario.getPorta());
        atualizalista(usuario, "add");
        listaUsuarios();
    }

    synchronized private void atualizalista(Usuario usuario, String acao) {
        if (acao.equals("add")) {
            clientes.add(usuario);
        }
        JSONObject json = new JSONObject();
        json.put("action", "chat_general_client");
        json.put("mensagem", usuario.getNome() + " conectou-se.");
        broadcast(json);
    }

    synchronized private void listaUsuarios() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                serverLog("Arrumando lista de usuários...");
                JSONArray arr = new JSONArray();
                DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
                model.setRowCount(0);
                try {
                    for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
                        Usuario usuario = i.next();
                        String tipo;
                        if (usuario.getTipo().equals("D")) {
                            tipo = "Doador";
                        } else {
                            tipo = "Coletor";
                        }
                        model.addRow(new Object[]{usuario.getIp(), usuario.getPorta(), usuario.getNome(), tipo, usuario.getMaterial(), usuario.getOcupado(), usuario.getFalando()});
                        JSONObject newJson = usuario.getJson();
                        newJson.put("porta", usuario.getPorta());
                        newJson.remove("action");
                        usuario.setJson(newJson);
                        arr.put(usuario.getJson());
                    }
                } catch (Exception e) {
                    errorLog("Erro ao listar usuários.", 0, e.getMessage());
                }
                JSONObject lista = new JSONObject();
                lista.put("action", "client_list");
                lista.put("lista", arr);
                broadcast(lista);

            }
        });

    }

    synchronized public void broadcast(JSONObject json) {
        System.out.println("Broadcast: " + json);
        for (Iterator<Usuario> i = clientes.iterator(); i.hasNext();) {
            Usuario usuario = i.next();
            PrintStream ps;
            try {
                ps = new PrintStream(usuario.getSocket().getOutputStream());
                ps.println(json.toString());
            } catch (IOException ex) {
                errorLog("Erro ao mandar Broadcast.", Integer.parseInt(usuario.getPorta()), ex.getMessage());
            }
        }
    }

    private Usuario validaUsuario(JSONObject json, Socket socket) {
        Usuario usuario = new Usuario();
        usuario.setSocket(socket);
        usuario.setOcupado(false);
        usuario.setFalando(0);
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
}
