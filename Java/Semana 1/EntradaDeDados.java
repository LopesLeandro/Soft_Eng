import java.util.Scanner;
public class EntradaDeDados{
    public static void main(String[] args) {
        // Importa a classe Scanner
        
        try (// Cria um objeto Scanner
        Scanner entrada = new Scanner(System.in)) {
            // Lê uma string
            String nome = entrada.nextLine();
            // Lê um inteiro
            int idade = entrada.nextInt();
            // Lê um double
            double altura = entrada.nextDouble();
            // Lê um caractere
            char sexo = entrada.next().charAt(0);
            // Lê um booleano
            boolean casado = entrada.nextBoolean();
            // Imprime os valores lidos
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);

            System.out.println("Sexo: " + sexo);
            System.out.println("Casado: " + casado);
        }
    }
}