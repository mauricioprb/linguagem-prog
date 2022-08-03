/* 
Criar uma classe Java com um método execútavel, para solicitar
dois números e uma operação aritmética desejada para resolver.
Efetue o cálculo escolhido e aparesente o resultado na tela do
computador
*/
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        char operador = JOptionPane.showInputDialog("Digite o operador: ").charAt(0);
        
        switch (operador) {
            case '+':
                JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " = " + (valor1 + valor2));
                break;
            case '-':
                JOptionPane.showMessageDialog(null, valor1 + " - " + valor2 + " = " + (valor1 - valor2));
                break;
            case '*':
                JOptionPane.showMessageDialog(null, valor1 + " * " + valor2 + " = " + (valor1 * valor2));
                break;
            case '/':
                JOptionPane.showMessageDialog(null, valor1 + " / " + valor2 + " = " + (valor1 / valor2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro");
                break;
        }
    }
}