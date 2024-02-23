package ch02;

public class C18Scope {
    public static void main(String[] args) {
        //변수는 선언된 블럭 안에서만 사용가능
        int a = 3;

        if (true) {
            int b = 5;
            System.out.println("if 안");
            System.out.println(a);
            System.out.println(b);
        }

        System.out.println("if 밖");
        System.out.println(a);
    }
}
