import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("194.168.43.12", 12345);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date dataAtual = (Date) entrada.readObject();
            Scanner scanner = new Scanner(System.in);
            JOptionPane.showMessageDialog(null, "Data recebida do servidor: " +  dataAtual.toString());
            System.out.println("Data recebida do servidor: ");
            
            
            entrada.close();
            System.out.println("Conexão encerrada");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
