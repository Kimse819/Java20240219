package ch07.lecture.p2Polymorphism.Ex;

public class ChildEx {
    public static void main(String[] args) {
        Child child = new Child();

        parent parent = child;

        parent.method1();
        parent.method2();
    }
}
