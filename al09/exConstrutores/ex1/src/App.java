package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int option;

        System.out.println("[1] - Nome e idade\n[2] - Somente idade");
        option = Integer.parseInt(scanner.nextLine());

        switch(option) {
            case 1:
                Pessoa pessoaNomeIdade = new Pessoa();
                System.out.println("Digite o nome: ");
                pessoaNomeIdade.setNome(scanner.nextLine());
                System.out.println("Digite a idade: ");
                pessoaNomeIdade.setIdade(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nome: " + pessoaNomeIdade.getNome());
                System.out.println("Idade: " + pessoaNomeIdade.getIdade());
                break;
            
            case 2:
                Pessoa pessoaIdade = new Pessoa();
                System.out.println("Digite a idade: ");
                pessoaIdade.setIdade(Integer.parseInt(scanner.nextLine()));
                System.out.println("Idade: " + pessoaIdade.getIdade());
                break;

            default:
                System.out.println("Opcao invalida");
                break;
            }
        } 
}