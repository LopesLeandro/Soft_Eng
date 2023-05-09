import java.util.Scanner;

public class Ifs{
public static void main(String[] args) {
    // Importa a classe Scanner
    

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n = entrada.nextInt();
    if( n > 0){
        System.out.println("O número é positivo");
    }else if (n < 0){
        System.out.println("O número é negativo");
    }else{
        System.out.println("O número é zero");
    }
}}