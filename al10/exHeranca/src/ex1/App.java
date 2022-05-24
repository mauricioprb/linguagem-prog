package ex1;

import java.util.Scanner;


public class App extends Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade);
    }
}