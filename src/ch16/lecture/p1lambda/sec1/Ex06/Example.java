package ch16.lecture.p1lambda.sec1.Ex06;

public class Example {
    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result = " + result);
    }

    private static double calc(Function fun) {
        double x = 10;
        double y = 4;

        return fun.apply(x, y);
    }
}
