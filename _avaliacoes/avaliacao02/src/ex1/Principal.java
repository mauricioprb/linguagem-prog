package ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();  
        System.out.println("Digite seu nome:");
        pessoa1.setNome(scanner.nextLine());
        System.out.println("Digite sua data de nascimento:");
        pessoa1.setDataNasc(scanner.nextLine());
        System.out.println("Digite sua altura:");
        pessoa1.setAltura(Float.parseFloat(scanner.nextLine()));

        System.out.println("");

        Pessoa pessoa2 = new Pessoa();  
        System.out.println("Digite seu nome:");
        pessoa2.setNome(scanner.nextLine());
        System.out.println("Digite sua data de nascimento:");
        pessoa2.setDataNasc(scanner.nextLine());
        System.out.println("Digite sua altura:");
        pessoa2.setAltura(Float.parseFloat(scanner.nextLine()));

        System.out.println("");

        pessoa1.exibir();
        System.out.println("");
        pessoa2.exibir();
    }
}