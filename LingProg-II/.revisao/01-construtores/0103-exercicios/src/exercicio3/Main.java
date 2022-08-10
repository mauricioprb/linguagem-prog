// Crie uma classe, também chamada Disciplina, com os mesmos atributos e métodos do exercício
// 2. Entretanto, o valor dos atributos definidos no construtor devem ser recebidos por parâmetros
// no momento da instanciação dessa classe. Imprima na tela o resultado das atribuições.

package exercicio3;

import exercicio2.Disciplina;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();

        disciplina.exibirDados();
    }
}