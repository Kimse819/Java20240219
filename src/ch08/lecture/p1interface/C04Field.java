package ch08.lecture.p1interface;

public class C04Field {
    public static void main(String[] args) {
        int a = C04MyInterface.AGE;
        System.out.println(C04MyInterface.NAME);
        System.out.println(C04MyInterface.MY_ADDRESS);
    }
}

interface C04MyInterface {
    int AGE = 0;
    String NAME = "son hm";
    String MY_ADDRESS = "London";

    void method1();


}
