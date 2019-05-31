/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaspkg;

import org.json.*;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public String jsao;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
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
        IpLabel = new javax.swing.JLabel();
        IpTextField = new javax.swing.JTextField();
        PortaTextField = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        MaterialLabel = new javax.swing.JLabel();
        MaterialComboBox = new javax.swing.JComboBox<>();
        DescricaoLabel = new javax.swing.JLabel();
        DescricaoScrollPane = new javax.swing.JScrollPane();
        DescricaoTextPane = new javax.swing.JTextPane();
        ConectarButton = new javax.swing.JButton();
        PortaLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ColetorRadioButton = new javax.swing.JRadioButton();
        DoadorRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 390));

        IpLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IpLabel.setText("IP:");
        IpLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IpLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        IpLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        IpLabel.setPreferredSize(new java.awt.Dimension(15, 15));
        getContentPane().add(IpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        IpTextField.setText("127.0.0.1");
        IpTextField.setMaximumSize(new java.awt.Dimension(150, 20));
        IpTextField.setMinimumSize(new java.awt.Dimension(150, 20));
        IpTextField.setPreferredSize(new java.awt.Dimension(150, 20));
        IpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        PortaTextField.setText("1234");
        PortaTextField.setMaximumSize(new java.awt.Dimension(50, 20));
        PortaTextField.setMinimumSize(new java.awt.Dimension(20, 20));
        PortaTextField.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(PortaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, -1));

        NomeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NomeLabel.setText("Nome:");
        NomeLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        getContentPane().add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 20));

        NomeTextField.setText("Teste");
        getContentPane().add(NomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        MaterialLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaterialLabel.setText("Material:");
        getContentPane().add(MaterialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, 20));

        MaterialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oleo", "metal", "roupa", "papel", "plastico", "eletronico" }));
        MaterialComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(MaterialComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, -1));

        DescricaoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DescricaoLabel.setText("Descrição:");
        getContentPane().add(DescricaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        DescricaoTextPane.setEnabled(false);
        DescricaoTextPane.setMinimumSize(new java.awt.Dimension(300, 200));
        DescricaoTextPane.setPreferredSize(new java.awt.Dimension(300, 200));
        DescricaoScrollPane.setViewportView(DescricaoTextPane);

        getContentPane().add(DescricaoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 310, 160));

        ConectarButton.setText("Conectar");
        ConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConectarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        PortaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PortaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortaLabel.setText("Porta:");
        PortaLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        getContentPane().add(PortaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 20));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarButtonActionPerformed

        try {
            String ip = IpTextField.getText();
            int porta = Integer.parseInt(PortaTextField.getText());
            String nome = NomeTextField.getText();
            String material = MaterialComboBox.getSelectedItem().toString();
            String tipo = "";
            String action = "connect";
            if (DoadorRadioButton.isSelected()) {
                tipo = "D";
            } else {
                tipo = "C";
            }
            String descricao = DescricaoTextPane.getText();
            JSONObject json = new JSONObject();
            json.put("action", action);
            json.put("nome", nome);
            json.put("material", material);
            json.put("tipo", tipo);
            if (DoadorRadioButton.isSelected()) {
                json.put("descricao", descricao);
            }
            System.out.println(json);
            jsao = json.toString();
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        String serverHostname = new String(IpTextField.getText());
        Integer porta = new Integer(PortaTextField.getText());

        System.out.println("Conectando ao IP " + serverHostname + " na porta " + porta + ".");

        Socket socket = null;
        PrintStream out = null;
        BufferedReader in = null;
        try {
            socket = new Socket(serverHostname, porta);
            out = new PrintStream(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //JOptionPane.showConfirmDialog(null, "Conexao Realizada com Suceso!", "Desconectar", 0);
            Object[] option = {"OK", "Desconectar?"};
            int flag = JOptionPane.showOptionDialog(null, "Conexão Realizada com Sucesso!", "Conexão", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, null);
            out.println(jsao);
            //BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            while (flag != JOptionPane.YES_OPTION) {
                //out.println(userInput);
                if (flag == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Desconectado com Sucesso!");
                    dispose();
                    System.exit(0);
                }
            }

            out.close();
            in.close();
            //stdIn.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println();
            JOptionPane.showMessageDialog(null, "Não é possível encontrar o servidor " + serverHostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Não é possível conectar a " + serverHostname);
            System.exit(1);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
