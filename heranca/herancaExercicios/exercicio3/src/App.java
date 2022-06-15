/*
Uma empresa está cadastrado seus funcionários em sua base de dados. Sabendo que Funcionario é uma Pessoa,
e que pessoas possuem (nome, idade e telefone), e que seus funcionários são divididos por (setor, cargo e função). 
Crie uma classe executável, e cadastre 3 funcionários, preferencialmente solicitando as informações via console ao usuário.
Após esse cadastro, exibe esse funcionários na tela. A classe Funcionario deve herdar as características da classe Pessoa.
 */

import javax.swing.JOptionPane;

public class App {
    public static String solicitarDados(String dado) {
        return JOptionPane.showInputDialog(dado);
    }
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = solicitarDados("Digite seu nome: ");
        funcionario1.idade = solicitarDados("Digite sua idade: ");
        funcionario1.telefone = solicitarDados("Digite seu telefone: ");
        funcionario1.setor = solicitarDados("Digite seu setor: ");
        funcionario1.cargo = solicitarDados("Digite seu cargo: ");
        funcionario1.funcao = solicitarDados("Digite seu função: ");
        funcionario2.nome = solicitarDados("Digite seu nome: ");
        funcionario2.idade = solicitarDados("Digite sua idade: ");
        funcionario2.telefone = solicitarDados("Digite seu telefone: ");
        funcionario2.setor = solicitarDados("Digite seu setor: ");
        funcionario2.cargo = solicitarDados("Digite seu cargo: ");
        funcionario2.funcao = solicitarDados("Digite seu função: ");       
        funcionario3.nome = solicitarDados("Digite seu nome: ");
        funcionario3.idade = solicitarDados("Digite sua idade: ");
        funcionario3.telefone = solicitarDados("Digite seu telefone: ");
        funcionario3.setor = solicitarDados("Digite seu setor: ");
        funcionario3.cargo = solicitarDados("Digite seu cargo: ");
        funcionario3.funcao = solicitarDados("Digite seu função: "); 

        JOptionPane.showMessageDialog(null, "Funcionário 1:" +
                "\nNome: " + funcionario1.nome + 
                "\nIdade: " + funcionario1.idade + 
                "\nTelefone: " + funcionario1.telefone + 
                "\nSetor: " + funcionario1.setor +
                "\nCargo: " + funcionario1.cargo + 
                "\nFunção: " + funcionario1.funcao);       
        JOptionPane.showMessageDialog(null, "Funcionário funcionario2:" +
                "\nNome: " + funcionario2.nome + 
                "\nIdade: " + funcionario2.idade + 
                "\nTelefone: " + funcionario2.telefone + 
                "\nSetor: " + funcionario2.setor +
                "\nCargo: " + funcionario2.cargo + 
                "\nFunção: " + funcionario2.funcao);  
        JOptionPane.showMessageDialog(null, "Funcionário 3:" +
                "\nNome: " + funcionario3.nome + 
                "\nIdade: " + funcionario3.idade + 
                "\nTelefone: " + funcionario3.telefone + 
                "\nSetor: " + funcionario3.setor +
                "\nCargo: " + funcionario3.cargo + 
                "\nFunção: " + funcionario3.funcao);
    }
}