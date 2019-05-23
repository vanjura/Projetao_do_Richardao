/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaspkg;

import java.awt.HeadlessException;
import org.json.*;
import java.io.*;
import java.net.*;
import java.util.Date;
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
        PainelGeral = new javax.swing.JPanel();
        IpPanel = new javax.swing.JPanel();
        IpLabel = new javax.swing.JLabel();
        IpTextField = new javax.swing.JTextField();
        PortaLabel = new javax.swing.JLabel();
        PortaTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        PortaPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NomePanel = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        TipoPanel = new javax.swing.JPanel();
        ColetorRadioButton = new javax.swing.JRadioButton();
        DoadorRadioButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        MaterialPanel = new javax.swing.JPanel();
        MaterialLabel = new javax.swing.JLabel();
        MaterialComboBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        DescriçcaoPanel = new javax.swing.JPanel();
        DescricaoLabelPanel = new javax.swing.JPanel();
        DescricaoLabel = new javax.swing.JLabel();
        DescricaoScrollPane = new javax.swing.JScrollPane();
        DescricaoTextPane = new javax.swing.JTextPane();
        jTextArea1 = new javax.swing.JTextArea();
        ConectarPanel = new javax.swing.JPanel();
        ConectarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        PainelGeral.setLayout(new javax.swing.BoxLayout(PainelGeral, javax.swing.BoxLayout.PAGE_AXIS));

        IpPanel.setLayout(new javax.swing.BoxLayout(IpPanel, javax.swing.BoxLayout.LINE_AXIS));

        IpLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IpLabel.setText("IP:");
        IpLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IpLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        IpLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        IpLabel.setPreferredSize(new java.awt.Dimension(15, 15));
        IpPanel.add(IpLabel);

        IpTextField.setMaximumSize(new java.awt.Dimension(150, 20));
        IpTextField.setMinimumSize(new java.awt.Dimension(150, 20));
        IpTextField.setPreferredSize(new java.awt.Dimension(150, 20));
        IpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpTextFieldActionPerformed(evt);
            }
        });
        IpPanel.add(IpTextField);

        PortaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PortaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortaLabel.setText("Porta:");
        PortaLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        PortaLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        IpPanel.add(PortaLabel);

        PortaTextField.setMaximumSize(new java.awt.Dimension(50, 20));
        PortaTextField.setMinimumSize(new java.awt.Dimension(20, 20));
        PortaTextField.setPreferredSize(new java.awt.Dimension(50, 20));
        IpPanel.add(PortaTextField);

        PainelGeral.add(IpPanel);
        PainelGeral.add(jPanel2);

        PortaPanel.setLayout(new javax.swing.BoxLayout(PortaPanel, javax.swing.BoxLayout.LINE_AXIS));
        PainelGeral.add(PortaPanel);
        PainelGeral.add(jPanel1);

        NomePanel.setLayout(new javax.swing.BoxLayout(NomePanel, javax.swing.BoxLayout.LINE_AXIS));

        NomeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NomeLabel.setText("Nome:");
        NomeLabel.setPreferredSize(new java.awt.Dimension(46, 15));
        NomePanel.add(NomeLabel);
        NomePanel.add(NomeTextField);

        PainelGeral.add(NomePanel);

        jPanel3.setMinimumSize(new java.awt.Dimension(10, 30));
        jPanel3.setPreferredSize(new java.awt.Dimension(10, 30));
        PainelGeral.add(jPanel3);

        TipoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(ColetorRadioButton);
        ColetorRadioButton.setText("Coletor");
        ColetorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColetorRadioButtonActionPerformed(evt);
            }
        });
        TipoPanel.add(ColetorRadioButton);

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
        TipoPanel.add(DoadorRadioButton);

        PainelGeral.add(TipoPanel);
        PainelGeral.add(jPanel5);

        MaterialPanel.setLayout(new javax.swing.BoxLayout(MaterialPanel, javax.swing.BoxLayout.LINE_AXIS));

        MaterialLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaterialLabel.setText("Material:");
        MaterialPanel.add(MaterialLabel);

        MaterialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oleo", "Metal", "Roupa", "Papel", "Plastico", "Eletronico" }));
        MaterialPanel.add(MaterialComboBox);

        PainelGeral.add(MaterialPanel);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 30));
        PainelGeral.add(jPanel4);

        DescriçcaoPanel.setLayout(new javax.swing.BoxLayout(DescriçcaoPanel, javax.swing.BoxLayout.PAGE_AXIS));

        DescricaoLabelPanel.setLayout(new java.awt.GridLayout());

        DescricaoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DescricaoLabel.setText("Descrição:");
        DescricaoLabelPanel.add(DescricaoLabel);

        DescriçcaoPanel.add(DescricaoLabelPanel);

        DescricaoTextPane.setEnabled(false);
        DescricaoTextPane.setMinimumSize(new java.awt.Dimension(300, 200));
        DescricaoTextPane.setPreferredSize(new java.awt.Dimension(300, 200));
        DescricaoScrollPane.setViewportView(DescricaoTextPane);

        DescriçcaoPanel.add(DescricaoScrollPane);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        DescriçcaoPanel.add(jTextArea1);

        PainelGeral.add(DescriçcaoPanel);

        ConectarPanel.setLayout(new java.awt.GridLayout(1, 0));

        ConectarButton.setText("Conectar");
        ConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarButtonActionPerformed(evt);
            }
        });
        ConectarPanel.add(ConectarButton);

        PainelGeral.add(ConectarPanel);

        getContentPane().add(PainelGeral);

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

        System.out.println("Tentando conectar ao IP " + serverHostname + " na porta " + porta + ".");

        Socket sockete = null;
        PrintStream out = null;
        BufferedReader in = null;

        try {
            sockete = new Socket(serverHostname, porta);
            out = new PrintStream(sockete.getOutputStream());
            in = new BufferedReader(new InputStreamReader(sockete.getInputStream()));
            JOptionPane.showConfirmDialog(null, "Conexão Realizada com sucesso!","Conexão", JOptionPane.DEFAULT_OPTION);
            out.println(jsao);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            System.out.print ("input: ");
	while ((userInput = stdIn.readLine()) != null) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());
	}

	out.close();
	in.close();
	stdIn.close();
	sockete.close();
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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JPanel ConectarPanel;
    private javax.swing.JLabel DescricaoLabel;
    private javax.swing.JPanel DescricaoLabelPanel;
    private javax.swing.JScrollPane DescricaoScrollPane;
    private javax.swing.JTextPane DescricaoTextPane;
    private javax.swing.JPanel DescriçcaoPanel;
    private javax.swing.JRadioButton DoadorRadioButton;
    private javax.swing.JLabel IpLabel;
    private javax.swing.JPanel IpPanel;
    private javax.swing.JTextField IpTextField;
    private javax.swing.JComboBox<String> MaterialComboBox;
    private javax.swing.JLabel MaterialLabel;
    private javax.swing.JPanel MaterialPanel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JPanel NomePanel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JPanel PainelGeral;
    private javax.swing.JLabel PortaLabel;
    private javax.swing.JPanel PortaPanel;
    private javax.swing.JTextField PortaTextField;
    private javax.swing.JPanel TipoPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
