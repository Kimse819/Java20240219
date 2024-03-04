package ch06.p1field.Ex;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        System.out.println("제작회사 = " + myCar.company);
        System.out.println("모델명 = " + myCar.model);
        System.out.println("색상 = " + myCar.color);
        System.out.println("최고속도 = " + myCar.maxspeed);
        System.out.println("현재속도 = " + myCar.speed);

        myCar.speed = 70;
        System.out.println("수정된 속도 = " + myCar.speed);

    }
}
