// Crie uma classe Principal para solicitar e exibir na tela as informações de nome,
// sobrenome, e-mail, idade e telefone do usuário. Esses atributos são herdados da
// classe Usuario.

package exercicio1;

public class Main extends Usuario {
    public static void main(String[] args) {
        nome = "Mauricio";
        sobrenome = "Pereira";
        email = "mauprb@gmail.com";

        System.out.println(nome + " " + sobrenome + "\n" + email);
    }
}