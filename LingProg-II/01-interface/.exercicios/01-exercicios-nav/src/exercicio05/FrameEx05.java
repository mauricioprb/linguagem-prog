package exercicio05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameEx05 extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public FrameEx05() {
        initComponents();
        tableDados.setRowHeight(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btLerArq = new javax.swing.JButton();
        tfNomeArq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Telefone", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDados);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabela de Cadastro");

        btLerArq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLerArq.setText("Ler");
        btLerArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLerArqActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do arquivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfNomeArq, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLerArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeArq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLerArq, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLerArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLerArqActionPerformed
        try {
            ArrayList lacunas = arquivo.lerArq(tfNomeArq.getText());
            
            tableDados.setValueAt(lacunas.get(0), 0, 0);
            tableDados.setValueAt(lacunas.get(1), 0, 1);
            tableDados.setValueAt(lacunas.get(2), 0, 2);
            tableDados.setValueAt(lacunas.get(3), 0, 3);
            
            tableDados.setValueAt(lacunas.get(4), 1, 0);
            tableDados.setValueAt(lacunas.get(5), 1, 1);
            tableDados.setValueAt(lacunas.get(6), 1, 2);
            tableDados.setValueAt(lacunas.get(7), 1, 3);
            
            tableDados.setValueAt(lacunas.get(8), 2, 0);
            tableDados.setValueAt(lacunas.get(9), 2, 1);
            tableDados.setValueAt(lacunas.get(10), 2, 2);
            tableDados.setValueAt(lacunas.get(11), 2, 3);

            tableDados.setValueAt(lacunas.get(12), 3, 0);
            tableDados.setValueAt(lacunas.get(13), 3, 1);
            tableDados.setValueAt(lacunas.get(14), 3, 2);
            tableDados.setValueAt(lacunas.get(12), 3, 3);

            tableDados.setValueAt(lacunas.get(12), 4, 0);
            tableDados.setValueAt(lacunas.get(13), 4, 1);
            tableDados.setValueAt(lacunas.get(14), 4, 2);
            tableDados.setValueAt(lacunas.get(12), 4, 3);

        } catch (IOException ex) {
            Logger.getLogger(FrameEx05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btLerArqActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEx05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLerArq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tableDados;
    private javax.swing.JTextField tfNomeArq;
    // End of variables declaration//GEN-END:variables
}