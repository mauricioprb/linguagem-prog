// Crie uma classe para realizar as 4 operações aritméticas entre dois números.
// Utilize sobrescrita de métodos para efetuar as diferentes operações solicitadas. Além
// disso, apresente na tela os resultados.

package exercicio3;

public class Main {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        adicao.calcular(2, 1);
        adicao.exibirResultado();

        Subtracao subtracao = new Subtracao();
        subtracao.calcular(2, 3);
        subtracao.exibirResultado();

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(2, 4);
        multiplicacao.exibirResultado();

        Divisao divisao = new Divisao();
        divisao.calcular(4, 2);
        divisao.exibirResultado();
    }
}