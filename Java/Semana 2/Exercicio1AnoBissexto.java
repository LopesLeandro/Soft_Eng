import java.util.Scanner;

/*Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto. Regras para o cálculo dos anos bissextos:

De 4 em 4 anos é ano bissexto.
De 100 em 100 anos não é ano bissexto.
De 400 em 400 anos é ano bissexto.
Prevalecem as últimas regras sobre as primeiras */

public class Exercicio1AnoBissexto {
    


public static void main(String[] args) {
    Scanner ano = new Scanner(System.in);

    System.out.println("Digite um ano qualquer com 4 digitos: ");
    int anoDigitado = ano.nextInt();

    if (anoDigitado % 400 == 0) {
        System.out.println("O ano " + anoDigitado + " é bissexto");
    } else if (anoDigitado % 100 == 0) {
        System.out.println("O ano " + anoDigitado + " não é bissexto");
    } else if (anoDigitado % 4 == 0) {
        System.out.println("O ano " + anoDigitado + " é bissexto");
    } else {
        System.out.println("O ano " + anoDigitado + " não é bissexto");
    }

}
}