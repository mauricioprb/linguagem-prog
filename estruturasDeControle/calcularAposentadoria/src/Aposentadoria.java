/*
Criar uma classe, em Java, para solicitar  o nome, a idade e o gênero (M ou F) de uma pessoa e apresentar, 
na tela do computador, esses dados solicitados. Adicionalmente, informe a idade mínima de aposentadoria para essa pessoa.
*/
import javax.swing.JOptionPane;

public class Aposentadoria {
    public static void main(String[] args) {
        String nome = solicitarDados("Digite o nome");
        int idade = Integer.parseInt(solicitarDados("Digite a idade"));
        char genero = solicitarDados("Qual o gênero M ou F ?").charAt(0);
        int idadeMinima = verificarAposentadoria(genero);
        exibirResultado(nome, idade, genero, idadeMinima);
    }
    
    public static String solicitarDados(String solicitacao) {
        return JOptionPane.showInputDialog(solicitacao);
    }
    
    public static int verificarAposentadoria(char genero) {
        int idade = 0;
        switch(genero) {
            case 'F': {
                idade = 57;
                break;
            }
            case 'M': {
                idade = 65;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,"Gênero inválido");
                break;
            }
        }
        return idade;
    }
    
    public static void exibirResultado(String nome, int idade, char genero, int idadeMinima) {
        String resposta = "EXIBIÇÃO DOS RESULTADOS\n" +
                "NOME: " + nome + "\n" +
                "IDADE: " + idade + "\n" +
                "GÊNERO: " + genero + "\n" +
                "IDADE MÍNIMA P/ APOSENTADORIA: " + idadeMinima;
        JOptionPane.showMessageDialog(null, resposta);
                
    }
    
    
}