package View;

import Model.Client;
import javax.swing.JOptionPane;

public class ClientView {
    public Client getUserData() {
        Client cliente = new Client();
        cliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
        return cliente;
    }
    
    public void showUserData(Client cliente) {
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + cliente.getNome() + "\n" + "Idade: " + cliente.getIdade());
    }   
}