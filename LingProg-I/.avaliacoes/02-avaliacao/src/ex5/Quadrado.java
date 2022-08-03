package ex5;

public class Quadrado implements FormaGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return getLado() * getLado();
    }

    @Override
    public double calculaPerimetro() {
        return 4 * getLado();
    }
}