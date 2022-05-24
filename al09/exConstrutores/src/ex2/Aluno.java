public class Aluno {
    private String nome;
    private String dataNasc;
    private int matricula;

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
    public String getmatricula() {
        return matricula;
    }
    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public Aluno(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public Aluno(String nome) {
        this.nome = nome;
    }   
}
