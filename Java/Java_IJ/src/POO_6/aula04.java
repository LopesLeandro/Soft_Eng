package POO_6;
public class aula04 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(-10, 8);
        Ponto p2 = new Ponto(33, -5);
        Ponto p3 = new Ponto(-10, 8);
        Ponto p4 = p1;
        System.out.println("p1 Hashcode: "+p1.hashCode());
        System.out.println("p2 Hashcode: "+p2.hashCode());
        System.out.println("p3 Hashcode: "+p3.hashCode());
        System.out.println("p4 Hashcode: "+p4.hashCode());
        System.out.println("p1 É igual p2? " + p1.equals(p2));
        System.out.println("p1 É igual p3? " + p1.equals(p3));
        System.out.println("p1 É igual p4? " + p1.equals(p4));
        System.out.println(p1);
        zerarPonto(p1);
        System.out.println(p1);
//        System.out.println(p4);
//        p4.setX(99999.9);
//        System.out.println(p1);
//        System.out.println(p4);
//        p1.z = 99.9;
//        p2.z = 88.8;
//        Ponto.z = 77.7;
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(StringUtil.estaVazio(" "));
//        Math.pow(10,2);
//        new Comparable<>(){
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
    }
    public static void zerarPonto(Ponto p){
        p.setX(0);
        p.setY(0);
    }
}