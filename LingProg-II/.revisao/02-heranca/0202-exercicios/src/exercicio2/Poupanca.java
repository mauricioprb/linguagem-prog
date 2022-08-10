// Crie uma classe chamada Poupança que herda da classe Conta (criada nestes
// slides) e realiza a sobrescrita do método abrirConta(), o qual deverá sobrescrever a
// implementação para imprimir na tela a mensagem “Uma nova conta poupança foi
// aberta com sucesso”.

package exercicio2;

public class Poupanca extends Conta {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca();

        poupanca.abrirConta();
    }

    @Override
    public void abrirConta() {
        System.out.println("Uma nova conta poupança foi aberta com sucesso");
    }
}