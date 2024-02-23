package ch02;

import java.math.BigDecimal;

public class Co10Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //연산시 원하는 결과가 나오지 않을 수 있음
        double c = a + b;
        System.out.println("c = " + c);

        //BigDecimal 사용해서 문제 해결
        BigDecimal d = new BigDecimal(0.1);
        BigDecimal e = new BigDecimal(0.2);

        BigDecimal f = d.add(e);

        System.out.println("f = " + f);
    }
}
