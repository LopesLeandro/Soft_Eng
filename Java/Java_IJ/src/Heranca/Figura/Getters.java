package Heranca.Figura;
import java.util.Scanner;
public class Getters extends Figura{
    private double altura;
    private double largura;
    private double raio;

    //getAltura
    public double getAltura(double altura) {
        return this.altura;
    }
    public void lerAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        getAltura(altura);
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
   //getLargura
   public double getLargura(double largura) {
       return this.largura;
   }
    public void lerLargura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        getAltura(largura);
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    //getRaio
    public double getRaio(double raio) {
        return this.raio;
    }
    public void lerRaio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Raio: ");
        double raio = scanner.nextDouble();
        getAltura(raio);
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
