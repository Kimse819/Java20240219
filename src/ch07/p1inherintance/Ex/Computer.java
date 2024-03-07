package ch07.p1inherintance.Ex;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
