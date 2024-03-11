package ch08.lecture.p1interface.Ex;

public class CarEx {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.run();

        mycar.tire1 = new KumhoTire();
        mycar.tire2 = new KumhoTire();

        mycar.run();
    }
}
