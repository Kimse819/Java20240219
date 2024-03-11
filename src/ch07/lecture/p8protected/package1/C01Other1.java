package ch07.lecture.p8protected.package1;

public class C01Other1 {
    private void method(){
        //protected private 접근 가능
        C01Parent o1 = new C01Parent();
        o1.method1();

        //protected 접근 가능
        o1.method2();
    }
}
