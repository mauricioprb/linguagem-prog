package exercicio08;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frame82 extends javax.swing.JFrame {
    Arquivo arquivo = new Arquivo();
    public Frame82() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenuItem();
        menuInfos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Contato");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Telefone");

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        menu.setText("☰");

        menuInicio.setText("Início");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        menu.add(menuInicio);

        menuPesquisar.setText("Pesquisar");
        menuPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarActionPerformed(evt);
            }
        });
        menu.add(menuPesquisar);

        menuInfos.setText("[!] - Infos");
        menuInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfosActionPerformed(evt);
            }
        });
        menu.add(menuInfos);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(tfNome)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(tfEmail)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        Frame81 form12 = new Frame81();
        form12.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarActionPerformed
        Frame83 form14 = new Frame83();
        form14.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPesquisarActionPerformed

    private void menuInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfosActionPerformed
        Frame84 form15 = new Frame84();
        form15.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInfosActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            arquivo.gravarArq(tfNome.getText(),tfEmail.getText(),tfTelefone.getText(), "agenda");
        } catch (IOException ex) {
            Logger.getLogger(Frame82.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame82().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuInfos;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JMenuItem menuPesquisar;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
