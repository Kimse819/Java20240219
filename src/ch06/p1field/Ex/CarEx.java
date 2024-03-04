package ch06.p1field.Ex;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
    }
}
