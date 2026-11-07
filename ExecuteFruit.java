package pto.ch01;

public class ExecuteFruit {
    public static void Check(Fruit fruit) {
        if (fruit instanceof Apple) {
            System.out.println("50점");
        } else if (fruit instanceof Orange){
            System.out.println("20점");
        } else if (fruit instanceof Peach) {
            System.out.println("30점");
        } else {
            System.out.println("변환 불가");
        }
    }
    static void main(String[] args) {
        Fruit p1 = new Apple();
        Fruit p2 = new Orange();
        Fruit p3 = new Peach();
        Check(p1);
        Check(p2);
        Check(p3);
    }
}
