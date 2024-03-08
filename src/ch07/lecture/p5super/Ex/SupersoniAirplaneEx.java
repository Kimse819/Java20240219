package ch07.lecture.p5super.Ex;

public class SupersoniAirplaneEx {
    public static void main(String[] args) {
        SupersoniAirplane sa = new SupersoniAirplane();
        sa.takeoff();
        sa.fly();
        sa.flyMode = SupersoniAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersoniAirplane.NOMAL;
        sa.fly();
        sa.land();

    }
}
