package ch06.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass o1 = new C04MyClass("son", 31);
        C04MyClass o2 = new C04MyClass("Lee", 22);

        System.out.println(o1.name + ", " + o1.age);
        System.out.println(o2.name + ", " + o1.age);
    }
}



class C04MyClass{
    String name;

    int age;

    C04MyClass(String initalName, int initalAge) {
        name = initalName;
        age = initalAge;
    }
}
