// Crie uma formulário (interface gráfica) que contenha 3 componentes
// jLabel, responsáveis por exibir na tela (em tempo de execução) o conteúdo
// de três atributos (nome do veículo, cor do veículo e ano de fabricação)
// definidos em uma classe chamada Veiculo. Essa classe Veiculo deverá
// associar valores aos atributos, no método construtor da classe. Dessa
// forma, você deverá instanciar a classe Veiculo e mostrar na tela gráfica o
// conteúdo dos atributos solicitados.
// Dica: faça a instanciação da classe veículo e a associação dos atributos aos
// componentes jLabel no construtor da classe da interface gráfica

package exercicio1;

import java.awt.Color;

public class Form extends javax.swing.JFrame {
    public Form() {
        initComponents();
        getContentPane().setBackground(Color.decode("#ffffff"));
        
        Veiculo carro1 = new Veiculo("Fusca", "Azul", 1960);
        nomeCarro.setText(carro1.getNome());
        corCarro.setText(carro1.getCor());
        anoCarro.setText(String.valueOf(carro1.getAno()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        anoCarro = new javax.swing.JLabel();
        nomeCarro = new javax.swing.JLabel();
        corCarro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atributos veículo");
        setBackground(new java.awt.Color(64, 64, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(300, 250));
        setName("janela"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ATRIBUTOS DO VEÍCULO");
        titulo.setToolTipText("");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 800, 90));

        anoCarro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        anoCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anoCarro.setText("ano");
        getContentPane().add(anoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 800, -1));

        nomeCarro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nomeCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeCarro.setText("nome");
        getContentPane().add(nomeCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 800, -1));

        corCarro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        corCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corCarro.setText("cor");
        getContentPane().add(corCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoCarro;
    private javax.swing.JLabel corCarro;
    private javax.swing.JLabel nomeCarro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}