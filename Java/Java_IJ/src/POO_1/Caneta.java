package POO_1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);

    }
    void rabiscar(){
        if(this.tampada == true) {
            System.out.println("ERRO: Não posso rabiscar, estou tampada!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
