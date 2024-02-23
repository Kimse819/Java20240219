package ch02;

public class C21TypeConversion {
    public static void main(String[] args) {
        //자동타입변환 : 작은크기 -> 큰 크기
        //강제타입변환(casting) : 큰 크기 -> 작은 크기

        long a = 235;
        int b = (int) a; //강제타입변환
//      int b = a; // X (안됨 )
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        short c = 50;
        byte d = (byte) c; //

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        short e = 128;
        byte f = (byte) e;

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        short g = 384;
        byte h = (byte) g;

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //강제타입변환(casting) 정수형 -> 실수형
        double i = 3.14;
        int j = (int) i; //소수점 이하 탈락

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
