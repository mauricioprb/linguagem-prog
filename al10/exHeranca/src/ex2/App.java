package ex2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe um nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.println("Informe uma idade: ");
        pessoa.idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe um tipo: ");
        pessoa.tipo = scanner.nextLine();

        System.out.println("Nome: " + pessoa.nome + "\n" + "Idade: " + pessoa.idade + "\n" + "Tipo: " + pessoa.tipo);
        System.out.println("Esta pessoa: " + pessoa.andar());
        System.out.println("Esta pessoa: " + pessoa.falar());
    }
}
