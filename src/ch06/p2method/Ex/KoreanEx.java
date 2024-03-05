package ch06.p2method.Ex;

public class KoreanEx {
    public static void main(String[] args) {
        Korean k1 = new Korean("김세현", "030309-1234567");

        System.out.println("k1.nation :" + k1.nation);
        System.out.println("k1.name :" + k1.name);
        System.out.println("k1.ssn :" + k1.ssn);

        System.out.println("----------------------");

        Korean k2 = new Korean("김현수", "030617-8910112");
        System.out.println("k2.nation :" + k2.nation);
        System.out.println("k2.name :" + k2.name);
        System.out.println("k2.ssn :" + k2.ssn);
    }
}
