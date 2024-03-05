package ch06.p3constructor;

public class C01Constructor {
    public static void main(String[] args) {

        System.out.println("11111");
        C01MyClass obj = new C01MyClass();

        System.out.println("22222");

    }

}

class C01MyClass{
    //필드

    //생성자 : Constructor
    //객체 생성 시 실행되는 코드블럭
    //생성자 이름은 클래스 이름과 같음
    C01MyClass() {
        //객체 생성 시 처음 실행되어야 하는 코드들
        //보통 필드값 초기화
        //초기설정

        System.out.println("객체 생성 시 초기화 코드");
    }

    //메소드
}