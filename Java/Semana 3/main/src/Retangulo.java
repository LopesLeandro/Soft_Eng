import java.util.Scanner;

public class Retangulo {
    int altura;
    int largura;


    public void setAltura(int altura) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a altura:");
        this.altura = s.nextInt();
    }

    public void setLargura(int largura) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a largura:");
        this.largura = s.nextInt();
    }

    // Construtor padrão
    // Não tem retorno
    // Mesmo nome da classe

    public Retangulo(){}

    // Construtor com dois parâmetros
    public Retangulo(int altura, int lagura){
        setLargura(largura);
        setAltura(altura);
    }

    public int getAltura() {
        return this.altura;
    }

    public int getLargura() {
        return this.largura;
    }

    public boolean isQuadrado() {
        return altura == largura;
    }

    // Converte o objeto para uma String 
    public String toString() {
        return "[Retangulo ={altura:"
                +altura+", largura:"+largura+"}]";
    }
}