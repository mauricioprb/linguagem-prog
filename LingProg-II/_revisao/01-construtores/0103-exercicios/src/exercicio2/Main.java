// Crie uma classe chamada Disciplina que contenha os atributos nome da disciplina e carga
// horária. Tanto o nome da disciplina quanto a carga horária são definidos pelo construtor da
// própria classe. Além do construtor, crie um método para exibir esses dados após a sua atribuição.
// O método para exibir os dados deverá ser chamado em uma outra classe.

package exercicio2;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();

        disciplina.exibirDados();
    }
}