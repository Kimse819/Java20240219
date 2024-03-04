package ch06.p1field;

import ch06.p1field.Ex.Car;

public class C03field {
    public static void main(String[] args) {
        Co3Car Car1 = new Co3Car();
        System.out.println(Car1.color);
        System.out.println(Car1.price);

        Co3Car Car2 = new Co3Car();
        System.out.println(Car2.color);
        System.out.println(Car2.price);

        Car2.color = "red";
        Car2.price = 5000;
        System.out.println(Car1.color);
        System.out.println(Car1.price);
        System.out.println(Car2.color);
        System.out.println(Car2.price);
    }
}

//클래스는 보통 다른 파일에 작성되지만 강의편의상 한 파일에 작성

class Co3Car {
    String color = "white";
    int price = 3000;

}
