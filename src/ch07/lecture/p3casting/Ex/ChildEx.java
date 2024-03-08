package ch07.lecture.p3casting.Ex;

public class ChildEx {
    public static void main(String[] args) {
        //객체생성 및 자동 타입변환
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        //강제 타입변환
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
