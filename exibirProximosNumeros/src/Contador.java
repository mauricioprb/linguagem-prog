/*
Criar uma classe Java, com um método executável, para solicitar
um número inteiro e exibir, na tela, os próximos 10 números inteiros a partir dele
*/
import javax.swing.JOptionPane;

public class Contador {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        String valores = "";

        for(int i = numero; i <= (numero + 10); i++) {
            valores = valores + i + " ";
        }

        JOptionPane.showMessageDialog(null, valores);  
    }
}