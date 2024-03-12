package ch09.lecture.p1nested.Ex;

public class AEx1 {
    public static void main(String[] args) {
        A1.B b = new A1.B();
        System.out.println(b.field1);
        b.method();

        System.out.println(A1.B.field2);
        A1.B.method2();
    }
}
