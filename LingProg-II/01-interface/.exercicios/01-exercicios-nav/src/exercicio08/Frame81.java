package exercicio08;

public class Frame81 extends javax.swing.JFrame {
    public Frame81() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btProcurar = new javax.swing.JButton();
        btInfo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenuItem();
        menuProcurar = new javax.swing.JMenuItem();
        menuInfos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda de Contatos");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btProcurar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btProcurar.setText("Procurar");
        btProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarActionPerformed(evt);
            }
        });

        btInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btInfo.setText("!");
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });

        menu.setText("☰");

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        menu.add(menuCadastrar);

        menuProcurar.setText("Procurar");
        menuProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcurarActionPerformed(evt);
            }
        });
        menu.add(menuProcurar);

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btProcurar)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        Frame82 frame82 = new Frame82();
        frame82.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcurarActionPerformed
        Frame83 frame83 = new Frame83();
        frame83.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuProcurarActionPerformed

    private void menuInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfosActionPerformed
        Frame84 frame84 = new Frame84();
        frame84.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInfosActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Frame82 frame82 = new Frame82();
        frame82.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarActionPerformed
        Frame83 frame83 = new Frame83();
        frame83.setVisible(true);
        dispose();
    }//GEN-LAST:event_btProcurarActionPerformed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        Frame84 frame84 = new Frame84();
        frame84.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInfoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame81().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btInfo;
    private javax.swing.JButton btProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuCadastrar;
    private javax.swing.JMenuItem menuInfos;
    private javax.swing.JMenuItem menuProcurar;
    // End of variables declaration//GEN-END:variables
}