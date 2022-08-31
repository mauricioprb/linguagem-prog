package exercicio3;

public class Computador {
    private String fabricante;
    private String modelo;
    private float preco;

    public Computador(String modelo, float preco) {
        fabricante = "dell";
        this.modelo = modelo;
        this.preco = preco;
    } 

    public Computador(String fabricante, String modelo, float preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPreco() {
        return preco;
    }
}