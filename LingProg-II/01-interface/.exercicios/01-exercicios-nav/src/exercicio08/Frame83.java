package exercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frame83 extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public Frame83() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenuItem();
        menuInfos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisar");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPesquisar.setText("Peqsuisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
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

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        menu.add(menuCadastrar);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableFocusGained

    }//GEN-LAST:event_tableFocusGained

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        Frame81 form12 = new Frame81();
        form12.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        Frame82 form13 = new Frame82();
        form13.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfosActionPerformed
        Frame84 form15 = new Frame84();
        form15.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInfosActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
            ArrayList listaContato = arquivo.lerArq("agenda");
            
            int index = 0;
            for (int i = 0; i <= ((listaContato.size() + 1) / 3) - 1; i++) {
                System.out.println(i);
                for (int j = 0; j <= ((listaContato.size() + 1) / 3) - 1; j++) {
                    table.setValueAt(listaContato.get(index), i, j);
                    index++;
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Frame83.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame83().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuCadastrar;
    private javax.swing.JMenuItem menuInfos;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}