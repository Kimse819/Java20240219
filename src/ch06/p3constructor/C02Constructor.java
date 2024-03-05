package ch06.p3constructor;

public class C02Constructor {
    public static void main(String[] args) {
        C02MyClass obj1 = new C02MyClass();
        C02MyClass obj2 = new C02MyClass();

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}

class C02MyClass{
    int age;

    C02MyClass(){
        age = 25;
    }
}
