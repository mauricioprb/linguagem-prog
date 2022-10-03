package exercicio03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameEx03 extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public FrameEx03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_lerArquivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_lerArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_lerArquivo.setText("Ler tabela");
        jButton_lerArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lerArquivoActionPerformed(evt);
            }
        });

        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nomes", "Emails"
            }
        ));
        jScrollPane1.setViewportView(tableDados);
        if (tableDados.getColumnModel().getColumnCount() > 0) {
            tableDados.getColumnModel().getColumn(0).setResizable(false);
            tableDados.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton_lerArquivo)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_lerArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_lerArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lerArquivoActionPerformed
        try {
            ArrayList tableNome = arquivo.lerArq("dados", 1);
            
            tableDados.setValueAt(tableNome.get(0), 0, 0);
            tableDados.setValueAt(tableNome.get(1), 1, 0);
            tableDados.setValueAt(tableNome.get(2), 2, 0);
            
            ArrayList tableEmail = arquivo.lerArq("dados", 0);
            
            tableDados.setValueAt(tableEmail.get(0), 0, 1);
            tableDados.setValueAt(tableEmail.get(1), 1, 1);
            tableDados.setValueAt(tableEmail.get(2), 2, 1);
        } catch (IOException ex) {
            Logger.getLogger(FrameEx03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_lerArquivoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEx03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_lerArquivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDados;
    // End of variables declaration//GEN-END:variables
}