package exercicio07;

public class FrameEx71 extends javax.swing.JFrame {
    public FrameEx71() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btInfosInstituicao = new javax.swing.JButton();
        btInfosAluno = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmMenu = new javax.swing.JMenu();
        jmInfosAluno = new javax.swing.JMenuItem();
        jmInfosInstituicao = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universidade Franciscana");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Painel Principal");

        btInfosInstituicao.setText("Informações da Instituição");
        btInfosInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfosInstituicaoActionPerformed(evt);
            }
        });

        btInfosAluno.setText("Informações Aluno");
        btInfosAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfosAlunoActionPerformed(evt);
            }
        });

        jmMenu.setText("☰");
        jmMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenuActionPerformed(evt);
            }
        });

        jmInfosAluno.setText("Informações do aluno");
        jmInfosAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInfosAlunoActionPerformed(evt);
            }
        });
        jmMenu.add(jmInfosAluno);

        jmInfosInstituicao.setText("Informações da instituição");
        jmInfosInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInfosInstituicaoActionPerformed(evt);
            }
        });
        jmMenu.add(jmInfosInstituicao);

        jMenuBar2.add(jmMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btInfosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btInfosInstituicao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInfosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInfosInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenuActionPerformed

    }//GEN-LAST:event_jmMenuActionPerformed

    private void jmInfosAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInfosAlunoActionPerformed
        FrameEx72 frameEx72 = new FrameEx72();
        frameEx72.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmInfosAlunoActionPerformed

    private void jmInfosInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInfosInstituicaoActionPerformed
        FrameEx73 form11 = new FrameEx73();
        form11.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmInfosInstituicaoActionPerformed

    private void btInfosInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfosInstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInfosInstituicaoActionPerformed

    private void btInfosAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfosAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInfosAlunoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEx71().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInfosAluno;
    private javax.swing.JButton btInfosInstituicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmInfosAluno;
    private javax.swing.JMenuItem jmInfosInstituicao;
    private javax.swing.JMenu jmMenu;
    // End of variables declaration//GEN-END:variables
}