package POO_2;

public class aula002 {

    public static void main(String[] args){
            Carros c1 = new Carros();
            c1.marca = "Fiat";
            c1.modelo = "Uno";
            c1.ano = 2010;
            c1.proprietario = "João";
            c1.Dados();
            c1.Ligar();


            Carros c2 = new Carros();
            c2.marca = "Ford";
            c2.modelo = "Fiesta";
            c2.ano = 2015;
            c2.proprietario = "Eu";
            c2.Dados();
            c2.Ligar();

        }
}