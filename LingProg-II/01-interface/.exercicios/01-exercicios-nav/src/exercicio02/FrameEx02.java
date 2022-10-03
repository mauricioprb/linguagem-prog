package exercicio02;

import exercicio01.Arquivo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameEx02 extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public FrameEx02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbPessoal = new javax.swing.JRadioButton();
        rbProfissional = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btSalvarContato = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taConsole = new javax.swing.JTextArea();
        btExibirContato = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfEmailContato = new javax.swing.JTextField();
        tfTelefoneContato = new javax.swing.JTextField();
        tfNomeContato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup2.add(rbPessoal);
        rbPessoal.setText("Pessoal");

        buttonGroup2.add(rbProfissional);
        rbProfissional.setText("Profissional");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Agenda de Contatos");

        btSalvarContato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvarContato.setText("Salvar");
        btSalvarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarContatoActionPerformed(evt);
            }
        });

        taConsole.setEditable(false);
        taConsole.setColumns(20);
        taConsole.setRows(5);
        jScrollPane2.setViewportView(taConsole);

        btExibirContato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExibirContato.setText("Exibir");
        btExibirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirContatoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        tfNomeContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeContatoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de contato:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExibirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbPessoal)
                        .addGap(18, 18, 18)
                        .addComponent(rbProfissional))
                    .addComponent(tfEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(tfTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPessoal)
                            .addComponent(rbProfissional))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSalvarContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExibirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeContatoActionPerformed

    private void btSalvarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarContatoActionPerformed
        String texto = tfNomeContato.getText() + "\n" + tfTelefoneContato.getText() + "\n" + tfEmailContato.getText() + "\n";
        if (rbPessoal.isSelected()) {
            texto = texto + "Contato: " + rbPessoal.getText();
        } else {
            texto = texto + "Contato: " + rbProfissional.getText();
        }
        try {
            arquivo.gravarArq(texto, tfNomeContato.getText());
        } catch (IOException ex) {
            Logger.getLogger(FrameEx02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarContatoActionPerformed

    private void btExibirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirContatoActionPerformed
        try {
            taConsole.setText(arquivo.lerArq(tfNomeContato.getText()));
        } catch (IOException ex) {
            Logger.getLogger(FrameEx02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExibirContatoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEx02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibirContato;
    private javax.swing.JButton btSalvarContato;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton rbPessoal;
    private javax.swing.JRadioButton rbProfissional;
    private javax.swing.JTextArea taConsole;
    private javax.swing.JTextField tfEmailContato;
    private javax.swing.JTextField tfNomeContato;
    private javax.swing.JTextField tfTelefoneContato;
    // End of variables declaration//GEN-END:variables
}