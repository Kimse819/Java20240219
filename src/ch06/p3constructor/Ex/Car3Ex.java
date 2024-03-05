package ch06.p3constructor.Ex;

public class Car3Ex {
    public static void main(String[] args) {
        Car3 mycar = new Car3("포르쉐");
        Car3 yourcar= new Car3("벤츠");

        mycar.run();
        yourcar.run();
    }
}
