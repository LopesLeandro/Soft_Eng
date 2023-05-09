package POO_6;

public class Ponto {
    private double x;
    private double y;

    // static -> muda o escopo de classe
    public static double z = 0;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    //Método para comparar se dois objetos são iguais
    public boolean toEquals(Object o){
        return false;
    }
    //hash -> Valor numérico extraído dos valores dos atributos do objeto.
    public int hashCode(){
        return 1;
    }
    //Método para comparar se dois objetos são iguais
    @Override
    public boolean equals(Object obj) {
        // this -> proprio objeto que chamou o método
        if (this == obj){
            return true;
        }
        // se o objeto pertence a classe Ponto.
        if(!(obj instanceof Ponto)){
            return false;
        }
        // Conversao do objeto para o tipo ponto
        Ponto p = (Ponto) obj;
        //return hashCode() == obj.hashCode();
        return x == p.x && y == p.y;
    }


}
