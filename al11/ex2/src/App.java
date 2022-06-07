/*
2. Crie uma classe para armazenar os atributos nome e email do usuário em um arquivo
texto, em que o nome do arquivo é o mesmo nome do usuário que foi digitado. Essa classe
deverá permitir a sobrecarga de métodos, em que o usuário poderá gravar o nome e o
email no arquivo, ou somente o nome. Crie uma classe Principal para realizar a leitura dos
atributos. Se ambos os atributos forem preenchidos a sobrecarga deverá ser uma. Se
apenas o nome do usuário for preenchido, então a sobrecarga deverá ser outra. Além
disso, ofereça ao usuário a opção de ler o conteúdo do arquivo de acordo com um nome
por ele informado.
*/
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserDados dados = new UserDados();

        Arquivo arquivo = new Arquivo();

        System.out.println("Informe o nome: ");
        dados.setNome(scanner.nextLine());

        System.out.println("Informe o email: ");
        dados.setEmail(scanner.nextLine());

        if(!dados.getNome().isEmpty() && !dados.getEmail().isEmpty()) {
            arquivo.criacaoArq(dados.getNome(), dados.getEmail());
        }

        else if(!dados.getNome().isEmpty() && dados.getEmail().isEmpty()) {
            arquivo.criacaoArq(dados.getNome());
        }
        else {
            System.out.println("Dados incompletos");
        } 
    }
}
