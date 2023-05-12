package Heranca.Figura;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

//    @Override
    public double obterArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
