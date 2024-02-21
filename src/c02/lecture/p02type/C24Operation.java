package c02.lecture.p02type;

public class C24Operation {
    public static void main(String[] args) {
        //1.같은타입 끼리의
        int a = 10;
        int b = 10;
        int c = a + b; //연산결과 int

        long d = 10;
        long e = 10;
        long f = d + e; //연산결과 long

        //2.다른 타입끼리의 연산의 결과는 큰타입
        int g = 10;
        long h = 10;
        long i = g + h; //연산결과 long

        int j = 10;
        double k = 3.14;
        double l = j + k; //연산결과 double

        //3. String과 다은 타입간 연산의 결과는 String
        int m = 10;
        String n = "10";
        String o = m + n; //연산결과 String

        System.out.println("o = " + o);

        String p = "20";
        String q = "30";
        String r = p + q;

        System.out.println("r = " + r);

    }
}
