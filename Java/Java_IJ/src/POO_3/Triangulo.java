package POO_3;

public class Triangulo {
    double base;
    double altura;

    public double getBase() {
        return base;
    }
    public void setBase(double value) {
        this.base = value;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double value) {
        this.altura = value;
    }
    public double getArea() {
        return (base * altura) / 2;
    }
}


