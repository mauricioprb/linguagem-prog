import javax.swing.JOptionPane;

public class Entrada {
    public String lerStr(String msgDialogo) {
        return JOptionPane.showInputDialog(msgDialogo);
    }

    public int lerInt(String msgDialogo) {
        return Integer.parseInt(JOptionPane.showInputDialog(msgDialogo));
    }       
}