package ch06.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "Lee";

        person1.walk(); //기능(메소드) 실행
        person2.walk(); // 메소드 실행

    }
}
class C01Person {

    String name;
    void walk() {
        // 메소드가 실행하는 코드들
        //
        System.out.println(name + "이(가) 걷습니다.");
    }
}
