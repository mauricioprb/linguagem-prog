package ex3;

public class Velho extends Imovel {
    private double precoVelho = preco - preco * 15/100;

    public double getPrecoVelho() {
        return precoVelho;
    }

    public void setPrecoVelho(double precoVelho) {
        this.precoVelho = precoVelho;
    }

    public String exibirVelho() {
        return "Endereço: " + endereco + "\n" + "Preço velho: R$ " + getPrecoVelho();
    }
}