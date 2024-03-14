package ch12.lecture.p1object;

public class C01ToString {
    public static void main(String[] args) {
        C01MyClass1 ob1 = new C01MyClass1();
        C01MyClass2 ob2 = new C01MyClass2();
        Object o1 = ob1;
        Object o2 = ob2;
        Object o3 = new C01MyClass1();
        Object o4 = new C01MyClass2();
        ob1.toString();
        ob2.toString();
        o3.toString();
        o4.toString();
    }
}
class C01MyClass1 extends Object{

}

//extends Object는 생략
class C01MyClass2{

}
