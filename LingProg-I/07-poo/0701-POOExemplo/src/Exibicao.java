import javax.swing.JOptionPane;

public class Exibicao {
    public void exibirDados(String nomeProduto, String fabricante, String nomeCliente, String email, String telefone) {
        String msgParaExibir = "Nome do Produto: " + nomeProduto + "\n" +
        "Fabricante: " + fabricante + "\n" +
        "Cliente: " + nomeCliente + "\n" +
        "Email: " + email + "\n" +
        "Telefone: " + telefone;
        
        JOptionPane.showMessageDialog(null, msgParaExibir);      
    }
    
    public void exibirDadosComOrientacaoAObjetos(Produto produto, Cliente cliente) {
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Fabricante: " + produto.fabricante);
        System.out.println("");
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Email: " + cliente.email);
        System.out.println("Telefone: " + cliente.telefone);
        System.out.println("Idade: " + cliente.idade);
    }
}