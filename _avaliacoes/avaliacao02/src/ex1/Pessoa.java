package ex1;

public class Pessoa {
    private String nome;
    private String dataNasc;
    private float altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        return 2022 - Integer.parseInt(getDataNasc().substring(6));
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + calcularIdade());
    }
}