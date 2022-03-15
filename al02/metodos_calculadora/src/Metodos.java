import javax.swing.JOptionPane;

public class Metodos {
    public static void main(String[] args) throws Exception{
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro numero: "));
        calculadora(num1, num2);
    }

    public static void calculadora(float valor1, float valor2) {
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