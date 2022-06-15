public class Carro {
    public String fabricante = "VW";
    public String modelo = "Fox";

    public void configurarDados(String fabCarro, String modCarro) {
        fabricante = fabCarro;
        modelo = modCarro;
    }
    public void exibir() {
        System.out.println("Dados carro: " + fabricante + " " + modelo);
    }
}
