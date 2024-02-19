package sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);

        int a = 100;
        int b = 200;

        int temp1 = a;
        a = b;
        b = temp1;
        System.out.println("a:" + a + ", b:" + b);
//        a와 b의 값을 바꿔서 출력되도록 하는 코드(=스왑)

        System.out.println(a);
        System.out.println(b);

    }

}
