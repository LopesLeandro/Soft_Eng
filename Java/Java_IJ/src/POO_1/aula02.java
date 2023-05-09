package POO_1;

public class aula02 {
    public static void main(String[] args){
        //System.out.println("Hello World POO");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 100;
        c1.modelo = "BIC";
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Krona";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}