package Heranca.Figura;
import java.util.Scanner;
//Atividade 03 10/05/2023
//Classe figura: -nome:String / +obterArea():double / +getNome():String / +setNome(value: String)
//Desenvolva as classes retangulo e circulo, estendendo a classe figura. Realize a sobrecarga do método obterArea().
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Qual figura você deseja criar? Digite [1] Retângulo [2] Círculo [3] Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Retângulo. Informe a altura:");
                double altura = scanner.nextDouble();
                System.out.println("Informe a largura:");
                double largura = scanner.nextDouble();

                Retangulo retangulo = new Retangulo(largura, altura);
                retangulo.setNome("Retangulo");
                System.out.println(retangulo.getNome());
                System.out.println("A área do retângulo é: " + retangulo.obterArea());
            } else if (opcao == 2) {
                System.out.println("Círculo. Informe o raio:");
                double raio = scanner.nextDouble();

                Circulo circulo = new Circulo(raio);
                circulo.setNome("Circulo");
                System.out.println(circulo.getNome());
                System.out.println(String.format("A área do círculo é: %.2f ", circulo.obterArea()));
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}





