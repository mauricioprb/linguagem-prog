package exercicio3;

public class Computador {
    private String fabricante;
    private String modelo;
    private float preco;

    public Computador(String modelo, float preco) {
        this.fabricante = "dell";
        this.modelo = modelo;
        this.preco = preco;
    }

    public Computador(String fabricante, String modelo, float preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
    }
}
