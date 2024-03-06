package ch06.p7access.Ex;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("myCar = " + myCar.getSpeed()); // 0

        myCar.setSpeed(60);
        System.out.println("myCar = " + myCar.getSpeed()); // 60

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("myCar = " + myCar.getSpeed());

    }
}
