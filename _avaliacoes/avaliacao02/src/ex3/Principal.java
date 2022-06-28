package ex3;

public class Principal {
    public static void main(String[] args) {
        Novo novo = new Novo();
        Velho velho = new Velho();

        System.out.println(novo.exibirNovo() + "\n\n" + velho.exibirVelho());
    }
}