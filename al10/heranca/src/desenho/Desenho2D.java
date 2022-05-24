package desenho;

public class Desenho2D extends Desenho {
    protected static int largura;
    protected static int altura;

    public static void exibir() {
        System.out.println("Dimensoes: " + largura + " x " + altura);
    }
}
