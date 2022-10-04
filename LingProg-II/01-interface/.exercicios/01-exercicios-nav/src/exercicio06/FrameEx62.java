package exercicio06;

public class FrameEx62 extends javax.swing.JFrame {

    public FrameEx62() {
        initComponents();
    }

    public FrameEx62(String nome, String email, String telefone) {
        initComponents();
        tfNomeAluno2.setText(nome);
        tfEmailAluno2.setText(email);
        tfTelefoneAluno2.setText(telefone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfIdadeAluno = new javax.swing.JTextField();
        tfCorAluno = new javax.swing.JTextField();
        tfCpfAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNomeAluno2 = new javax.swing.JTextField();
        tfEmailAluno2 = new javax.swing.JTextField();
        tfTelefoneAluno2 = new javax.swing.JTextField();
        rbMasculinoAluno = new javax.swing.JRadioButton();
        rbFemininoAluno = new javax.swing.JRadioButton();
        btAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sexo");

        jLabel2.setText("Idade");

        jLabel3.setText("Cor");

        jLabel4.setText("CPF");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cadastro de Aluno");

        jLabel6.setText("Nome");

        jLabel7.setText("Email");

        jLabel8.setText("Telefone");

        tfNomeAluno2.setEditable(false);

        tfEmailAluno2.setEditable(false);

        tfTelefoneAluno2.setEditable(false);

        buttonGroup1.add(rbMasculinoAluno);
        rbMasculinoAluno.setText("Masculino");

        buttonGroup1.add(rbFemininoAluno);
        rbFemininoAluno.setText("Feminino");

        btAvancar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAvancar.setText("Avançar");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTelefoneAluno2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(tfEmailAluno2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(tfNomeAluno2))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(tfIdadeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfCorAluno)
                                    .addComponent(jLabel4)
                                    .addComponent(tfCpfAluno)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(rbMasculinoAluno)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemininoAluno))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel5)))
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btAvancar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmailAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefoneAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculinoAluno)
                    .addComponent(rbFemininoAluno)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
      
        String sexo = "";
        if (rbMasculinoAluno.isSelected()) {
            sexo = rbMasculinoAluno.getText();
        }
        if (rbFemininoAluno.isSelected()) {
            sexo = rbFemininoAluno.getText();
        }
        
        FrameEx63 frameEx63 = new FrameEx63(sexo, tfIdadeAluno.getText(), tfCorAluno.getText(), tfCpfAluno.getText());
        frameEx63.setVisible(true);
        dispose();

    }//GEN-LAST:event_btAvancarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEx62().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbFemininoAluno;
    private javax.swing.JRadioButton rbMasculinoAluno;
    private javax.swing.JTextField tfCorAluno;
    private javax.swing.JTextField tfCpfAluno;
    private javax.swing.JTextField tfEmailAluno2;
    private javax.swing.JTextField tfIdadeAluno;
    private javax.swing.JTextField tfNomeAluno2;
    private javax.swing.JTextField tfTelefoneAluno2;
    // End of variables declaration//GEN-END:variables
}