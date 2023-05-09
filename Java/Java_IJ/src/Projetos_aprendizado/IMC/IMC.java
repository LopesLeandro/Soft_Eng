package Projetos_aprendizado.IMC;

import java.util.Scanner;
public class IMC {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        System.out.println("Calculo de IMC");
        do {
            p1.dados();
            p1.imc();
            p1.situacao();
        } while (p1.consulta() == true);
        System.out.println("Ok, até mais!");
    }
}