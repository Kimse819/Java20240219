package ch09.lecture.p1nested.Ex;

public class A0 {
    static class B{}

    B field1 = new B();

    static B field2 = new B();

    A0(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }

    static void method2(){
        B b = new B();
    }

}
