package ch03.logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        //단락 (short-Circuit evaluation)

        int i = 10;

        boolean b1 = (i++) == 10;
        System.out.println("b1 = " + b1);
        //(i++) -> //i값은 11로 바뀌었지만 연산결과는 10이다.

        i = 10;
        boolean b2 = (i++) == 10 && (i++) == 20;
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);

        i = 10;
        boolean b3 = (i++) == 20;
        System.out.println("b3 = " + b3);

        i = 10;
        boolean b4 = (i++) == 20 && (i++) == 30;
        System.out.println("b4 = " + b4);
        System.out.println("i = " + i);

        i = 10;
        boolean b5 = (i++) == 20 && (i++) == 50;
        System.out.println("b5 = " + b5);
        System.out.println("i = " + i);
    }
}
