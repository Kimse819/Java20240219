package ch08.lecture.p1interface;

public class C05DefaultMethod {

}

interface C05MyInterface {
//    body가 있는 public 인스턴스 메소드
    default void method100(){
        System.out.println("C05MyInterface.method100");
    }
}

class C05MyClass1 implements C05MyInterface{
    @Override
    public void method100(){

    }
}
class C05MyClass2 implements C05MyInterface{}

