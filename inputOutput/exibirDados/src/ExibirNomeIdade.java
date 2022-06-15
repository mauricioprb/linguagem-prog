// Escreva um programa que receba o nome e idade do usuário e exiba na tela

import javax.swing.JOptionPane;

public class ExibirNomeIdade {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite idade: ");
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade);
        // Exibe através do terminal
        //System.out.println("Nome: " + nome);
        //System.out.println("Idade: " + idade);
    } 
}