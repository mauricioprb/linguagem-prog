import java.util.Scanner;

public class App {
    public static void solicitarFrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
    }

    public static void main(String[] args) throws SemLetraB {
        try {
            solicitarFrase();
        } catch(SemLetraB e) {
            solicitarFrase();
        }
    }
}