package ex3;

public class Novo extends Imovel {
    private double precoNovo = preco + preco * 40/100;

    public double getPrecoNovo() {
        return precoNovo;
    }

    public void setPrecoNovo(double precoNovo) {
        this.precoNovo = precoNovo;
    }

    public String exibirNovo() {
        return "Endereço novo: " + endereco + "\n" + "Preço novo: R$ " + getPrecoNovo();
    }
}