import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno matriculaNome = new Aluno(13344532, "Joao");
        System.out.println("Matricula: " + matriculaNome.matricula + "\n" + "Nome: " + matriculaNome.nome);

        Aluno dataNascimento = new Aluno("05/06/2005");
        System.out.println("Data de nascimento: " + dataNascimento.dataNasc);

        Aluno nomeNascData = new Aluno("Pedro", "08/07/2000", 11454322);
        System.out.println("Nome: " + nomeNascData.nome + "\n" + "Data de nascimento: " + nomeNascData.dataNasc + "\n" + "Matricula: " + matriculaNome.matricula);
    }
}
