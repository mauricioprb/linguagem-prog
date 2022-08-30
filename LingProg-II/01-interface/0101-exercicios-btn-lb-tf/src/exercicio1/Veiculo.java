package exercicio1;

public class Veiculo {
    private String nome;
    private String cor;
    private int ano;

    public Veiculo(String nome, String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}