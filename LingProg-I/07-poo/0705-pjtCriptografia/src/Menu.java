import javax.swing.JOptionPane;

public class Menu {
    public int getOption() {
        String options = "Bem-vindo ao ambiente de criptografia e descriptografia\n"
                        + "[1] criptografar uma mensagem\n"
                        + "[2] descriptografar uma mensagem";
        return Integer.parseInt(JOptionPane.showInputDialog(options));
    }
    
    public String getMensagem(){
        return JOptionPane.showInputDialog("Digite a mensagem");
    }
    
    public int getChave(){
        return Integer.parseInt(JOptionPane.showInputDialog("Digite a chave criptográfica"));
    } 
}