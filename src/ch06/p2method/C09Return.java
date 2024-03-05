package ch06.p2method;

import java.util.Random;

public class C09Return {
    public static void main(String[] args) {
        C09Myclass obj = new C09Myclass();
        obj.method2();
    }
}


class C09Myclass {
    void method1() {
        //return;
        //1. 메소드 종료
        //2. 메소드가 호출된 값 반환
        //   이 때, 반환되는 값의 타입이 메소드의 차입과 일치해야 함.

        System.out.println("statement 1");
        System.out.println("statement 2");

        return; //메소드 종료

        //  System.out.println("statement 3"); // <- 실행 안됨(return 밑에 있기 때문)
    }
    void method2() {
        Random random = new Random();
        while (true){
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("(" + dice1 + ", " + dice2 + ")");
            if (dice1 == dice2) {
                return; //(break 또한 사용 가능)
            }
        }
    }
}