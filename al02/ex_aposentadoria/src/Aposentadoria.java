/*
Criar uma classe, para solicitar o nome, idade, e gênero (M ou F) de uma pessoa
e apresentar, esses dados solicitados. Adicionalmente, informe a idade miníma de
aposentadoria para a pessoa.
*/
import javax.swing.JOptionPane;

public class Aposentadoria {
    public static void main(String[] args) throws Exception {
        String nome = solicitarDados("Digite seu nome:");
        int idade = Integer.parseInt(solicitarDados("Digite seu nome:"));
        
    }
    public static String solicitarDados(String solicitacao) {
        return JOptionPane.showInputDialog(solicitacao);
    }
}
