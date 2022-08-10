package exercicio4;

public class Motor {
    private String nomeFabricante;
    private int potencia;
    private String tipo;


    public Motor() {
        nomeFabricante = "VW";
        potencia = 65;
        tipo = "Off-road";
    }

    public String exibir() {
        return "Fabricante: " + nomeFabricante + "\n" + "Potência: " + potencia + "cv" + "\n" + "Tipo: " + tipo;
    }
}