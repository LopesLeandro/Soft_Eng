package Projetos_aprendizado.IMC;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String sexo;
    int idade;
    float peso;
    float altura;

    float imc(){
        float imc = this.peso / (this.altura * this.altura);
        System.out.println("IMC: "+imc);
        return imc;
    }
    void situacao() {
        float imc = this.imc();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidade");
        } else if (imc >= 40) {
            System.out.println("Obesidade mórbida");
        }
    }

    void dados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite seu sexo: ");
        this.sexo = sc.nextLine();
        System.out.println("Digite sua idade: ");
        this.idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        this.peso = sc.nextFloat();
        System.out.println("Digite sua altura: ");
        this.altura = sc.nextFloat();
    }

    public boolean consulta() {
        System.out.println("Você quer verificar uma pessoa? [S] Sim | [N] Não");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("S");
    }
}


