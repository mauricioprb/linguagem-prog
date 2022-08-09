package exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Ford";
        carro.modelo = "Ranger";

        System.out.println("Marca: " + carro.marca + "\n" + "Modelo: " + carro.modelo);
    }
}