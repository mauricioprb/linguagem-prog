package ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        System.out.println("Digite o lado do quadrado:");
        quadrado.setLado(Float.parseFloat(scanner.nextLine()));
        System.out.println("Digite o raio do círculo: ");
        circulo.setRaio(Float.parseFloat(scanner.nextLine()));

        System.out.println("Área do quadrado: " + quadrado.calculaArea() + "\n" + "Perímetro do quadrado: " + quadrado.calculaPerimetro() + "\n");

        System.out.println("Área do círculo: " + circulo.calculaArea() + "\n" + "Perímetro do círculo: " + circulo.calculaPerimetro());
    }
}