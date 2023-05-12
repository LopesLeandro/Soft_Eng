package Heranca.Calculadora;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Percentual p = new Percentual();
        System.out.println(c.soma(1, 2));
        System.out.println(c.subtracao(1, 2));
        System.out.println(c.multiplicacao(1, 2));
        System.out.println(c.divisao(1, 2));
        System.out.println(p.percentual(1, 2));
    }
}
