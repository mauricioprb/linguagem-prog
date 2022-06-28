package ex2;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Fulano", "da Silva",  10000 * 12);
        Empregado empregado2 = new Empregado("Ciclano", "Sousa",  5800 * 12);
       
        System.out.println("Nome: " + empregado1.getNome() + " " + empregado1.getSobrenome() + "\n" + "Salário anual atual: R$ " + empregado1.getSalario() + "\n");
        System.out.println("Nome: " + empregado2.getNome() + " " + empregado2.getSobrenome() + "\n" + "Salário anual atual: R$ " + empregado2.getSalario());

        System.out.println("");

        empregado1.setSalario(empregado1.getSalario() + empregado1.getSalario() * 10/100);
        empregado2.setSalario(empregado2.getSalario() + empregado2.getSalario() * 10/100);

        System.out.println("Nome: " + empregado1.getNome() + " " + empregado1.getSobrenome() + "\n" + "Salário anual com acréscimo: R$ " + empregado1.getSalario() + "\n");
        System.out.println("Nome: " + empregado2.getNome() + " " + empregado2.getSobrenome() + "\n" + "Salário anual com acréscimo: R$ " + empregado2.getSalario());
    }
}