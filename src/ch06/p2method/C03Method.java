package ch06.p2method;

public class C03Method {
    public static void main(String[] args) {
        C04person john = new C04person();
        C04person jane = new C04person();
        john.name = "john";
        jane.name = "jane";

        john.run();
        jane.walk();
    }
}

//C04person 클래스 작성
class C04person{
    String name;

    void run() {
        System.out.println(name + "이 달립니다!!");
    }

    void walk() {
        System.out.println(name + "이 걷습니다!!");

    }
}
