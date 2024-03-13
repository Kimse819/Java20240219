package ch16.lecture.p1lambda;

public class C07Sample {
    public static void main(String[] args) {
        C07MyInterface obj1 = str -> System.out.println(str + str + str);
        C07MyInterface obj2 = s -> System.out.println(s + s);
        C07MyInterface obj3 = s -> System.out.println();
        obj1.method("hi");
        obj2.method("hello");
        obj3.method("spring");
    }
}

@FunctionalInterface
interface C07MyInterface{
    void method(String a);
}
