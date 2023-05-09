/*
Desenvolva a classe java apresentado no diagrama abaixo.
Para cada classe, crie um objeto e utilize os seus métodos.

Triangulo
base: double
altura: double
+getBase(): double
+setBase(value: double)
+getAltura(): double
+setAltura(value: double)
+getArea(): double
 */

package POO_3;

import java.util.Scanner;
public class aula03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Área do triângulo");
        System.out.println("Digite a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double height = sc.nextDouble();
        triangulo.setBase(base);
        triangulo.setAltura(height);
        System.out.println("Base do triângulo: " + triangulo.getBase());
        System.out.println("Altura do triângulo: " + triangulo.getAltura());
        System.out.println("Área do triângulo: " +
            String.format("%.2f", triangulo.getArea()));
    }
}
