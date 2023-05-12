package Heranca.Exemplo1;

public class Ferrari extends Carro{
    @Override
    public void acelerar(){
        super.acelerar();
        System.out.println("Ferrari.acelerar()");
    }
}
