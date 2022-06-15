// Criar três objetos do tipo Pessoa, e exibir apenas a idade dessas pessoas

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "mauricio";
        pessoa1.idade = 20;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "vinicius";
        pessoa2.idade = 19;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "bernardo";
        pessoa3.idade = 20;

        System.out.println(pessoa1.idade + "\n" + pessoa2.idade + "\n" + pessoa3.idade);
    }
}