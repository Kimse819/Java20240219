package ch07.lecture.p8protected.package2;


import ch07.lecture.p8protected.package1.A;

public class D extends A {
    public D(){
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    } //상속을 통해서만 가능

    public void method2(){
//        A a = new A();    //X
//        a.field = "value";  //X  --> 3줄 모두 직접 객체 생성해서 사용하는 것은 안됨
//        a.method();  //X
    }
}
