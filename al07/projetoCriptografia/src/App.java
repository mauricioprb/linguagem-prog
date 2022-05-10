import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Criptografia criptografia = new Criptografia();
        while (true) {
            switch (menu.getOption()) {
                case 1: {
                    String mensagem = menu.getMensagem();
                    int chave = menu.getChave();
                    JOptionPane.showMessageDialog(null, "Mensagem criptografada: " + criptografia.criptografar(mensagem, chave));
                    break;
                }
                case 2: {
                    String mensagem = menu.getMensagem();
                    int chave = menu.getChave();
                    JOptionPane.showMessageDialog(null, "Mensagem criptografada: " + criptografia.descriptografar(mensagem, chave));
                    break;
                }
            }

        }
    }

}