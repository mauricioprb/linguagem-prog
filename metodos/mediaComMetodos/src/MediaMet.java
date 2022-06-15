/*
Ler 3 números, calcular a média aritmética 
simples entre esses números e exibir na tela
do computador o resultado

COM O USO DE MÉTODOS/FUNÇÕES
*/
import javax.swing.JOptionPane;

public class MediaMet { 
    public static void main(String[] args) {
        float v1 = solicitarValor('a');
        float v2 = solicitarValor('b');
        float v3 = solicitarValor('c');
        calcular(v1, v2, v3);
    }
    
    public static float solicitarValor(char contador) {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para " + contador));
        return valor;
    }
    
    public static void calcular(float x, float y, float z) {
        JOptionPane.showMessageDialog(null, "Resultado da média: " + ((x + y + z) / 3));
    } 
}