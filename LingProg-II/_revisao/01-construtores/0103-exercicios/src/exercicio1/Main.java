// Crie uma classe A que possua dois atributos globais com valores associados e que possam ser
// acessados por uma outra classe B. Essa classe B deverá instanciar a classe A e imprimir na tela o
// conteúdo dos atributos definidos em A. 

package exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "VW";
        carro.modelo = "Fusca";

        System.out.println("Marca: " + carro.marca + "\n" + "Modelo: " + carro.modelo);
    }
}