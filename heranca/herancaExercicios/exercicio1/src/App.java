/* 
Crie uma classe Principal para solicitar e exibir na tela as informações de nome,
e-mail e telefone do usuário. Esses atributos são herdados da classe Usuário.
*/

import java.util.Scanner;

public class App extends Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade);
    }
}