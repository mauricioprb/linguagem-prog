public class App {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Frase inicial nula, para solucionar o problema, foi lhe atribuido um valor default.");
            frase = "frase vazia";
            novaFrase = frase.toUpperCase();
        } finally {
            System.out.println("finally");
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase antiga: " + novaFrase);
    }
}