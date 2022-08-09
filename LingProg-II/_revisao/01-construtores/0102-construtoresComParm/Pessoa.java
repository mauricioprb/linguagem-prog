package construtoresComParm;

public class Pessoa {
    public String nome;
    public String sobreNome;

    public Pessoa(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public void exibeValores() {
        System.out.println("Nome: " + nome + " "  + sobreNome);
    }
}
