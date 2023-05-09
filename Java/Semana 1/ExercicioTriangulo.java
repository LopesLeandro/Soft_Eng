/*Escreva um programa que identifique o tipo de triangulo. Deve ser informado as três arestas.  O programa deve informar se o triangulo é equilatero, isosceles ou escaleno.
arestas = []
for i in range(3):
    ar = int(input("Digite o valor da aresta: "))
    arestas.append(ar)

arestas.sort()

if arestas[0] + arestas[1] < arestas[2]:
    print("Não é um triangulo")
elif arestas[0] == arestas[1] and arestas[1] == arestas[2]:
    print("Triangulo equilatero")
elif arestas[0] == arestas[1] or arestas[1] == arestas[2] or arestas[0] == arestas[2]:
    print("Triangulo isosceles")
else:
    print("Triangulo escaleno")*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTriangulo {
    public static void main (String[] args) {

        List<Integer> arestas = new ArrayList<Integer>();        
        
        //Declara variáveis como inteiro
            int a, b, c;
        
        //Entrada de dados
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor da aresta A: ");
            a = entrada.nextInt();
            System.out.println("Digite o valor da aresta B: ");
            b = entrada.nextInt();
            System.out.println("Digite o valor da aresta C: ");
            c = entrada.nextInt();

        //Insere em uma lista  
            arestas.add((int) a);
            arestas.add((int) b);
            arestas.add((int) c);

        //Ordena com sort()
            arestas.sort(null);
        
        //Processamento dados
            if (arestas.get(0) + arestas.get(1) < arestas.get(2)) {
                System.out.println("Não é um triangulo");
            } else if (arestas.get(0) == arestas.get(1) && arestas.get(1) == arestas.get(2)) {
                System.out.println("Triangulo equilatero");
            } else if (arestas.get(0) == arestas.get(1) || arestas.get(1) == arestas.get(2) || arestas.get(0) == arestas.get(2)) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        }

}