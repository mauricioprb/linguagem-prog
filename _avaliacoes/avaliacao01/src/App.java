import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String frase = entradaDados();

        int numeroDigitado = posicaoDigitada();

        System.out.println(frase.substring(numeroDigitado));
        caractereAleatorio(frase);
    }

    public static String entradaDados() {
        return JOptionPane.showInputDialog("Digite uma frase:");
    }

    public static int posicaoDigitada() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição para começar a frase:"));
    }

    public static void caractereAleatorio(String frase) {
        Random random = new Random();

        int numAleatorio = random.nextInt(frase.length() + 1);

        System.out.println("\nO caractere aletório está na posição: " + numAleatorio);

        char charAleatorio = frase.charAt(numAleatorio - 1);

        System.out.println("\nO caractere sorteado foi: " + charAleatorio);
    }
}