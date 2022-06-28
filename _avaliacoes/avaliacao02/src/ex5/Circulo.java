package ex5;

public class Circulo implements FormaGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 3.14 * (getRaio() * getRaio());
    }

    @Override
    public double calculaPerimetro() {
        return 2 * 3.14 * getRaio();
    }   
}