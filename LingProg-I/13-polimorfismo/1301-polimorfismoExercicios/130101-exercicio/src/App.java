/*
Crie uma classe chamada Calculadora para realizar as 4 operações aritméticas entre 2 números.
Faça a sobrescrita de métodos de acordo com o tipo de operação. Uma classe principal deverá
solicitar ao usuário os números a serem calculados e exibir o resultado das operações.
 */

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        adicao.calcular(2, 3);
        adicao.exibeResultado();
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(2, 3);
        multiplicacao.exibeResultado();
        
        System.out.println("Retorno da adicao, sobrecarga: " + adicao.calcular(2));
        adicao.exibeResultado();
        adicao.calcular(2, 3);
        adicao.exibeResultado();

        int valor1 = solicitarValor("Digite o primeiro valor: ");
        int valor2 = solicitarValor("Digite o segundo valor: ");
    }
    
    public static int solicitarValor(String valor1) {
        return JOptionPane.showInputDialog();
    }
}