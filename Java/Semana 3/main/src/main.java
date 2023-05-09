import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // operador new -> Reserva espaço na memória
        // Retangulo() -> Construtor
        Retangulo r = new Retangulo();
        System.out.println("Altura:"+r.getAltura());
        System.out.println("Largura:"+r.getLargura());
        r.setAltura(1);
        r.setLargura(2);
        System.out.println("Altura:"+r.getAltura());
        System.out.println("Largura:"+r.getLargura());
        System.out.println("É um quadrado? "+r.isQuadrado());
        System.out.println(r);
    }    
}
