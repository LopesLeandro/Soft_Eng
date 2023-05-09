package POO_2;

public class Carros {
    String marca;
    String modelo;
    int ano;
    String proprietario;

    void Dados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }

    void Ligar(){
        if(this.proprietario == "Eu"){
            System.out.println("Ligando o carro!");
        } else {
            System.out.println("Não posso ligar o carro. Não é meu!");
        }
    }

}


