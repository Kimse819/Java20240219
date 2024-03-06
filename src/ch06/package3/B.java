package ch06.package3;

public class B {
    public void method() {
        A a = new A();

        a.feild1 = 1;
        a.feild2 = 1;
//        a.feild3 = 1;  ->  private 필드 접근 불가(컴파일 에러)

        a.method1();
        a.method2();
//        a.method3(); ->  private 메소드 접근 불가(컴파일 에러)
    }
}
