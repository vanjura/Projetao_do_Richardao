/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaspkg;

import java.awt.Color;
import org.json.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import server.Usuario;

public class Inicio extends javax.swing.JFrame {

    public Usuario cliente = new Usuario();
    public Socket socketCliente;
    public String chat = "G";
    public Socket socket;
    public PrintStream out;
    public BufferedReader in;
    public JTabbedPane pane;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        pane = TabbedPane;
        pane.setEnabledAt(2, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        IpLabel = new javax.swing.JLabel();
        IpTextField = new javax.swing.JTextField();
        PortaTextField = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        MaterialLabel = new javax.swing.JLabel();
        MaterialComboBox = new javax.swing.JComboBox<String>();
        DescricaoLabel = new javax.swing.JLabel();
        DescricaoScrollPane = new javax.swing.JScrollPane();
        DescricaoTextPane = new javax.swing.JTextPane();
        ConectarButton = new javax.swing.JButton();
        PortaLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ColetorRadioButton = new javax.swing.JRadioButton();
        DoadorRadioButton = new javax.swing.JRadioButton();
        jButtonDesconectar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaClients = new javax.swing.JTable();
        ChatPrivadoBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        ChatTextField = new javax.swing.JTextField();
        ChatSendBtn = new javax.swing.JButton();
        TabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChatTextPaneGeral = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatTextPaneMaterial = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        ChatTextPanePrivado = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IpLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IpLabel.setText("IP:");
        IpLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IpLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        IpLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        IpLabel.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel3.add(IpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        IpTextField.setText("127.0.0.1");
        IpTextField.setMaximumSize(new java.awt.Dimension(150, 20));
        IpTextField.setMinimumSize(new java.awt.Dimension(150, 20));
        IpTextField.setPreferredSize(new java.awt.Dimension(150, 20));
        IpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(IpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        PortaTextField.setText("1234");
        PortaTextField.setMaximumSize(new java.awt.Dimension(50, 20));
        PortaTextField.setMinimumSize(new java.awt.Dimension(20, 20));
        PortaTextField.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel3.add(PortaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, -1));

        NomeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NomeLabel.setText("Nome:");
        NomeLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        jPanel3.add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 20));

        NomeTextField.setText("Teste");
        jPanel3.add(NomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        MaterialLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaterialLabel.setText("Material:");
        jPanel3.add(MaterialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, 20));

        MaterialComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "oleo", "metal", "roupa", "papel", "plastico", "eletronico" }));
        MaterialComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(MaterialComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, -1));

        DescricaoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DescricaoLabel.setText("Descrição:");
        jPanel3.add(DescricaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        DescricaoTextPane.setEnabled(false);
        DescricaoTextPane.setMinimumSize(new java.awt.Dimension(300, 200));
        DescricaoTextPane.setPreferredSize(new java.awt.Dimension(300, 200));
        DescricaoScrollPane.setViewportView(DescricaoTextPane);

        jPanel3.add(DescricaoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 260));

        ConectarButton.setText("Conectar");
        ConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ConectarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, 20));

        PortaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PortaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortaLabel.setText("Porta:");
        PortaLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        jPanel3.add(PortaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(ColetorRadioButton);
        ColetorRadioButton.setSelected(true);
        ColetorRadioButton.setText("Coletor");
        ColetorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColetorRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ColetorRadioButton);

        buttonGroup1.add(DoadorRadioButton);
        DoadorRadioButton.setText("Doador");
        DoadorRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DoadorRadioButtonStateChanged(evt);
            }
        });
        DoadorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoadorRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DoadorRadioButton);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, 60));

        jButtonDesconectar.setText("Desconectar");
        jButtonDesconectar.setEnabled(false);
        jButtonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconectarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 480, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 510));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários Conectados"));
        jPanel5.setAutoscrolls(true);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Material", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaClients);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 140));

        ChatPrivadoBtn.setText("Conversa Privada");
        ChatPrivadoBtn.setEnabled(false);
        ChatPrivadoBtn.setFocusPainted(false);
        ChatPrivadoBtn.setFocusable(false);
        ChatPrivadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatPrivadoBtnActionPerformed(evt);
            }
        });
        jPanel5.add(ChatPrivadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 170, 120, 20));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 200));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChatTextField.setEnabled(false);
        ChatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatTextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(ChatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 410, 20));

        ChatSendBtn.setText("Enviar");
        ChatSendBtn.setEnabled(false);
        ChatSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatSendBtnActionPerformed(evt);
            }
        });
        jPanel6.add(ChatSendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 20));

        jScrollPane2.setViewportView(ChatTextPaneGeral);

        TabbedPane.addTab("Chat Geral", jScrollPane2);

        jScrollPane1.setViewportView(ChatTextPaneMaterial);

        TabbedPane.addTab("Chat Material", jScrollPane1);

        jScrollPane4.setEnabled(false);
        jScrollPane4.setViewportView(ChatTextPanePrivado);

        TabbedPane.addTab("Chat Privado", jScrollPane4);

        jPanel6.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 230));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 490, 290));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 510, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarButtonActionPerformed
        JSONObject validacao = validaInsercao();
        if (validacao.getBoolean("success")) {
            JSONObject user = criaUser("connect");
            System.out.println(user);
            String req = user.toString();
            iniciaConexão(req);
        } else {
            JOptionPane.showMessageDialog(null, validacao.getString("message"), "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConectarButtonActionPerformed

    private void DoadorRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DoadorRadioButtonStateChanged

    }//GEN-LAST:event_DoadorRadioButtonStateChanged

    private void DoadorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoadorRadioButtonActionPerformed
        if (DoadorRadioButton.isEnabled()) {
            DescricaoTextPane.setEnabled(true);
        }
    }//GEN-LAST:event_DoadorRadioButtonActionPerformed

    private void ColetorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColetorRadioButtonActionPerformed
        if (ColetorRadioButton.isEnabled()) {
            DescricaoTextPane.setText(null);
            DescricaoTextPane.setEnabled(false);
        }
    }//GEN-LAST:event_ColetorRadioButtonActionPerformed

    private void IpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IpTextFieldActionPerformed

    private void MaterialComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaterialComboBoxActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed
        //JOptionPane.showConfirmDialog(null, "Desconectado com sucesso!", "Desconectado", JOptionPane.DEFAULT_OPTION);
        int opt = JOptionPane.OK_OPTION;
        Object[] options = {"Sim", "Não"};
        int opcao = JOptionPane.showOptionDialog(null, "Você deseja se desconectar?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (opcao == JOptionPane.NO_OPTION) {
            opt = JOptionPane.NO_OPTION;
        }
        int opcao1 = JOptionPane.showOptionDialog(null, "Tem certeza?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (opcao1 == opt) {
            desconectaCliente(socketCliente);
            socketCliente = null;
            DefaultTableModel model = (DefaultTableModel) TabelaClients.getModel();
            model.setRowCount(0);
            ConectarButton.setEnabled(true);
            jButtonDesconectar.setEnabled(false);
            try {
                out.close();
                in.close();
                socket.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

    private void ChatPrivadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatPrivadoBtnActionPerformed
        chat = "P";
        try {
            int column = 0;
            int row = TabelaClients.getSelectedRow();
            String value = TabelaClients.getModel().getValueAt(row, column).toString();
            System.out.println(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário na tabela primeiro.");
        }
    }//GEN-LAST:event_ChatPrivadoBtnActionPerformed

    private void ChatSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatSendBtnActionPerformed
        if (!ChatTextField.getText().trim().equals("")) {
            enviaMensagem();
            ChatTextField.setText("");
        } else {
            ChatTextField.setText("");
        }
    }//GEN-LAST:event_ChatSendBtnActionPerformed

    private void ChatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatTextFieldActionPerformed
        if (!ChatTextField.getText().trim().equals("")) {
            enviaMensagem();
            ChatTextField.setText("");
        } else {
            ChatTextField.setText("");
        }
    }//GEN-LAST:event_ChatTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });

    }

    private void detectaTipo() {
        if (chat == "G") {
            broadcast();
        } else if (chat == "D") {

        }
    }

    private void enviaMensagem() {
        int selectedIndex = pane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                chat = "G";
                break;
            case 1:
                chat = "M";
                break;
        }
        JSONObject jsonMensagem = new JSONObject();
        String msg = ChatTextField.getText();
        jsonMensagem.put("mensagem", msg);
        switch (chat) {
            case "G":
                jsonMensagem.put("action", "chat_general_server");
                out.println(jsonMensagem.toString());
                break;
            case "M":
                jsonMensagem.put("action", "chat_room_server");
                out.println(jsonMensagem.toString());
                break;
            case "P":
                jsonMensagem.put("action", "chat_request_server");
                System.out.println("Chat Privado - ainda não implementado");
                break;
            default:
                System.out.println("Nenhum");
        }
    }

    private void broadcast() {
        String msg = ChatTextField.getText();
        ChatTextField.setText("");
        JSONObject jsonBroad = new JSONObject();
        jsonBroad.put("action", "chat_general_server");
        jsonBroad.put("mensagem", msg);
        out.println(jsonBroad.toString());
    }

    private void iniciaConexão(String req) {
        String ip = IpTextField.getText();
        Integer porta = new Integer(PortaTextField.getText());
        try {
            socket = new Socket(ip, porta);
            out = new PrintStream(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            this.socketCliente = socket;
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            out.println(req);

            ativaConexao();
            if (DoadorRadioButton.isEnabled()) {
                DescricaoTextPane.setEnabled(false);
            }

            new Thread() {
                @Override
                public void run() {
                    mensagemLog("Contectou a " + IpTextField.getText() + ":" + PortaTextField.getText());
                    try {
                        String userInput;
                        while (((userInput = in.readLine()) != null) || socketCliente != null) {
                            try {
                                JSONObject json = new JSONObject(userInput);
                                iniciaAcao(json);
                            } catch (JSONException ex) {
                                System.err.println("Erro no json" + ex);
                                desativaConexao();
                                desconectaCliente(socket);
                                out.close();
                                in.close();
                                socket.close();
                            }
                        }
                        desativaConexao();
                        desconectaCliente(socket);
                        out.close();
                        in.close();
                        socket.close();
                        //stdIn.close();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Você foi desconectado");
                        desativaConexao();
                        DefaultTableModel model = (DefaultTableModel) TabelaClients.getModel();
                        model.setRowCount(0);
                    }
                    System.out.println("Terminou a thread");
                }
            }.start();

        } catch (UnknownHostException e) {
            System.err.println();
            JOptionPane.showMessageDialog(null, "Não é possível encontrar o servidor " + ip + e);
            mensagemErro("Não é possível encontrar o servidor " + ip + "\n" + e);
            //System.exit(1);
        } catch (ConnectException e) {
            System.err.println();
            mensagemErro("Não é possível conectar a " + ip + ":" + porta);
            //System.exit(1);
        } catch (IOException e) {
            System.err.println("Erro com o IP " + ip + e);
            mensagemErro("Erro com o IP " + ip + "\n" + e);
            System.out.println(e.getMessage());
            //System.exit(1);
        }
    }

    public void ativaConexao() {
        chat = "G";
        jButtonDesconectar.setEnabled(true);
        ChatTextField.setEnabled(true);
        ChatSendBtn.setEnabled(true);
        ChatPrivadoBtn.setEnabled(true);
        ChatTextPaneMaterial.setText("");
        ChatTextPaneGeral.setText("");
        ConectarButton.setEnabled(false);
        IpTextField.setEnabled(false);
        PortaTextField.setEnabled(false);
        NomeTextField.setEnabled(false);
        MaterialComboBox.setEnabled(false);
        ColetorRadioButton.setEnabled(false);
        DoadorRadioButton.setEnabled(false);
    }

    public void desativaConexao() {
        chat = "G";
        jButtonDesconectar.setEnabled(false);
        ConectarButton.setEnabled(true);
        ChatTextPaneMaterial.setText("");
        ChatTextPaneGeral.setText("");
        ChatTextField.setEnabled(false);
        ChatSendBtn.setEnabled(false);
        ChatPrivadoBtn.setEnabled(false);
        IpTextField.setEnabled(true);
        PortaTextField.setEnabled(true);
        NomeTextField.setEnabled(true);
        MaterialComboBox.setEnabled(true);
        ColetorRadioButton.setEnabled(true);
        DoadorRadioButton.setEnabled(true);
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

    private void mensagemLog(String mensagem) {
        addTexto(ChatTextPaneGeral, mensagem, Color.DARK_GRAY);
    }

    private void mensagemGeral(String mensagem) {
        addTexto(ChatTextPaneGeral, "GERAL - " + mensagem, Color.BLUE);
    }

    private void mensagemMaterial(String mensagem) {
        addTexto(ChatTextPaneMaterial, mensagem, Color.GREEN.darker().darker());
        addTexto(ChatTextPaneGeral, mensagem, Color.GREEN.darker().darker());
    }

    private void mensagemErro(String mensagem) {
        addTexto(ChatTextPaneMaterial, "ERRO - " + mensagem, Color.RED);
        addTexto(ChatTextPaneGeral, "ERRO - " + mensagem, Color.RED);
    }

    private JSONObject criaUser(String action) {
        JSONObject user = new JSONObject();
        user.put("action", action);
        user.put("nome", NomeTextField.getText());
        user.put("material", MaterialComboBox.getSelectedItem().toString());
        if (DoadorRadioButton.isSelected()) {
            user.put("tipo", "D");
            user.put("descricao", DescricaoTextPane.getText());
        } else {
            user.put("tipo", "C");
        }

        return user;
    }

    private JSONObject validaInsercao() {
        String message = "";
        JSONObject validacao = new JSONObject();
        validacao.put("success", true);
        if (IpTextField.getText().trim().length() == 0) {
            message += "O Campo IP é Obrigatório.\n";
            validacao.put("success", false);
        }

        if (PortaTextField.getText().trim().length() == 0) {
            message += "O Campo Porta é Obrigatório.\n";
            validacao.put("success", false);
        }

        if (NomeTextField.getText().trim().length() == 0) {
            message += "O Campo Nome é Obrigatório.\n";
            validacao.put("success", false);
        }

        if (MaterialComboBox.getSelectedItem().toString() == "Selecione...") {
            message += "É obrigatório selecionar um material.\n";
            validacao.put("success", false);
        }

        if (!DoadorRadioButton.isSelected() && !ColetorRadioButton.isSelected()) {
            message += "É obrigatório selecionar um tipo.\n";
            validacao.put("success", false);
        }

        if (DoadorRadioButton.isSelected()) {
            if (DescricaoTextPane.getText().trim().length() == 0) {
                message += "Doador precisa informar uma descrição.\n";
                validacao.put("success", false);
            }
        }

        validacao.put("message", message);
        return validacao;
    }

    private void iniciaAcao(JSONObject json) {
        if (json.has("action")) {
            if (json.get("action").equals("client_list")) {
                listaClientes(json);
            } else if (json.get("action").equals("chat_general_client")) {
                chat_general_server(json);
            } else if (json.get("action").equals("chat_room_client")) {
                chat_room_client(json);
            } else {
                System.out.println("A ação " + json.get("action") + " não existe.");
            }
        } else {
            System.out.println("Action não encontrada.");
        }
    }

    private void chat_room_client(JSONObject json) {
        mensagemMaterial(json.getString("mensagem"));
    }

    private void chat_general_server(JSONObject json) {
        mensagemGeral(json.getString("mensagem"));
    }

    private void listaClientes(JSONObject json) {
        DefaultTableModel model = (DefaultTableModel) TabelaClients.getModel();
        model.setRowCount(0);
        ButtonGroup group = new ButtonGroup();
        JSONArray lista = json.getJSONArray("lista");
        for (int i = 0; i < lista.length(); i++) {
            JSONObject usuarioJson = (JSONObject) lista.get(i);
            System.out.println(usuarioJson);
            if (!usuarioJson.has("descricao")) {
                usuarioJson.put("descricao", "");
            }
            String tipo;
            if (usuarioJson.get("tipo").equals("D")) {
                tipo = "Doador";
            } else {
                tipo = "Coletor";
            }
            model.addRow(new Object[]{usuarioJson.get("porta"), usuarioJson.get("nome"), tipo, usuarioJson.get("material"), usuarioJson.get("descricao")});
        }
    }

    private void desconectaCliente(Socket socket) {
        ChatTextField.setEnabled(false);
        ChatSendBtn.setEnabled(false);
        ChatTextPaneMaterial.setText("");
        ChatPrivadoBtn.setEnabled(false);
        IpTextField.setEnabled(true);
        PortaTextField.setEnabled(true);
        NomeTextField.setEnabled(true);
        MaterialComboBox.setEnabled(true);
        ColetorRadioButton.setEnabled(true);
        DoadorRadioButton.setEnabled(true);
        if (DoadorRadioButton.isSelected()) {
            DescricaoTextPane.setEnabled(true);
        }
        JSONObject cliente = new JSONObject();
        //Preenche o objeto JSON com a action para desconectar
        cliente.put("action", "disconnect");
        String clienteDesconectandoJsonString = cliente.toString();

        //IPAddress = InetAddress.getLocalHost().getHostAddress(); //Pega o endereço
        //Manda mensagem ao servidor
        PrintStream saida;
        try {
            saida = new PrintStream(socket.getOutputStream());
            System.out.println("DESCONECTADO DO SERVIDOR: " + clienteDesconectandoJsonString);
            saida.println(clienteDesconectandoJsonString);//Envia uma String JSON
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChatPrivadoBtn;
    private javax.swing.JButton ChatSendBtn;
    private javax.swing.JTextField ChatTextField;
    private javax.swing.JTextPane ChatTextPaneGeral;
    private javax.swing.JTextPane ChatTextPaneMaterial;
    private javax.swing.JTextPane ChatTextPanePrivado;
    private javax.swing.JRadioButton ColetorRadioButton;
    private javax.swing.JButton ConectarButton;
    private javax.swing.JLabel DescricaoLabel;
    private javax.swing.JScrollPane DescricaoScrollPane;
    private javax.swing.JTextPane DescricaoTextPane;
    private javax.swing.JRadioButton DoadorRadioButton;
    private javax.swing.JLabel IpLabel;
    private javax.swing.JTextField IpTextField;
    private javax.swing.JComboBox<String> MaterialComboBox;
    private javax.swing.JLabel MaterialLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JLabel PortaLabel;
    private javax.swing.JTextField PortaTextField;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTable TabelaClients;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
