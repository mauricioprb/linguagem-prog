// Cadastrar um produto e um cliente e exibir os dados cadastrados na tela sem POO

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
        String fabricanteProduto = JOptionPane.showInputDialog("Digite o nome do fabricante do produto");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
        String emailCliente = JOptionPane.showInputDialog("Digite o email do cliente");
        
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Fabricante: " + fabricanteProduto);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Email: " + emailCliente); 
    }  
}