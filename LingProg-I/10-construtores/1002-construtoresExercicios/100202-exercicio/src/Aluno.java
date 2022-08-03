public class Aluno {
    public int matricula;
    public String dataNasc;
    public String nome;
    public int ano;

    public Aluno() { 
    }

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Aluno(String nome, String dataNasc, int ano) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.ano = ano;
    }
}