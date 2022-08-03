// É a classe Principal, orientada a objetos

public class AppPOO { 
    public static void main(String[] args) {
        // Classe objeto = new Classe();
        Entrada entrada = new Entrada();
        Produto produto = new Produto();        
        produto.nome = entrada.lerStr("Digite o nome do produto");
        produto.fabricante = entrada.lerStr("Digite fabricante");
        
        Cliente cliente = new Cliente();
        cliente.nome = entrada.lerStr("Digite o nome do cliente");
        cliente.email = entrada.lerStr("Digite o email do cliente");
        cliente.telefone = entrada.lerStr("Digite telefone do cliente");
        cliente.idade = entrada.lerInt("Digite a idade");
        
        Exibicao exibicao = new Exibicao();
        // exibicao.exibirDados(produto.nome, produto.fabricante, null, null, null);
        exibicao.exibirDadosComOrientacaoAObjetos(produto, cliente);
    } 
}