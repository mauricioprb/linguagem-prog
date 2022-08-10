package exercicio3;

public class Adicao extends Calculadora {
    float resultado = 0;

    @Override
    public void calcular(float valor1, float valor2) {
        resultado = valor1 + valor2;
    }

    @Override
    public void exibirResultado() {
        System.out.println("Adição: " + resultado);
    }
}