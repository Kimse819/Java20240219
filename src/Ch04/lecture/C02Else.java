package Ch04.lecture;

public class C02Else {
    public static void main(String[] args) {

        boolean condition = false;

        if (condition) {
            System.out.println("statement1");
            System.out.println("statement2");
        } else {
            //if의 조건이 false일 때 실행
            System.out.println("statement3");
            System.out.println("statement4");
        }
        System.out.println("statement5");
        System.out.println("statement6");
    }
}
