// Escreva um programa que receba a altura e largura de um retangulo e calcule a sua area.  Apresente o resultado em tela.

// Path: Java/04_Exercício2.java
// Escreva um programa que receba a altura e largura de um retangulo e calcule a sua area.  Apresente o resultado em tela.
import java.util.Scanner;

public class Exercicio1{
public static void main(String[] args) {
   

    Scanner entrada = new Scanner(System.in);
    int largura = entrada.nextInt();
    int altura = entrada.nextInt();
    int area = largura * altura;
    System.out.println("A area do retangulo é: " + area);
}
}