package ex4;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma x, y: " + calculadora.soma(2, 4));
        System.out.println("Soma x, y, z: " + calculadora.soma(2, 4, 7));
        System.out.println("Soma double x, y: " + calculadora.soma(31415925, 4291535));
    }
}