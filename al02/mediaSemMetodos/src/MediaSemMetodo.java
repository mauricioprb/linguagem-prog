import javax.swing.JOptionPane;
/*
Ler 3 números, calcular a média aritmética 
simples entre esses números e exibir na tela
do computador o resultado

SEM USO DE MÉTODOS/FUNÇÕES
*/
public class MediaSemMetodo {
    public static void main(String[] args) {
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1"));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2"));
        float v3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 3"));
        
        float media = (v1+v2+v3) / 3;

        JOptionPane.showMessageDialog(null, "Resultado da média: " + media);
    }
}
