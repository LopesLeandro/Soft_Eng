/*Leia um número positivo do usuário, então, calcule e imprima a sequência Fibonacci (onde cada número é a soma dos dois anteriores) até o primeiro número superior ao número lido. Exemplo: se o usuário informou o número 30, a sequência a ser impressa será 0 1 1 2 3 5 8 13 21 34. */

import java.util.Scanner;

public class Exercicio2Fibonacci{

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int input = entrada.nextInt();
        System.out.println("Digite um numero positivo: ");
        if (numero.hasNextInt() == false) {
            System.out.println("Digite um numero positivo: ");
        }
        int numeroDigitado = numero.nextInt();

        int numeroAnterior = 0;
        int numeroAtual = 1;
        int proximoNumero = 0;
        System.out.println(0);
        System.out.println(1);
        while (numeroAtual < numeroDigitado) {
            //System.out.println(proximoNumero);
            proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

            System.out.println(proximoNumero);
        }


    }
}