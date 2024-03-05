package ch06.p5static.Ex;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다!");
    }
    static void simulate(){
        Car myCar = new Car();
        myCar.speed = 300;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 80;
        myCar.run();
    }
}
