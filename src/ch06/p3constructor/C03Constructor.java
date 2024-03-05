package ch06.p3constructor;

public class C03Constructor {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass(25);
        C03MyClass obj2 = new C03MyClass(32);

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}

class C03MyClass{
    int age;

    C03MyClass(int initiaAge) {
        age = initiaAge;
    }
}
