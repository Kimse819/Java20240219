package ch06.p1field.Ex;

public class CarculatorEx {
    public static void main(String[] args) {
        Carculator myCalc = new Carculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;

        double result2 = myCalc.divide(x, y);
        System.out.println("result2 = " + result2);

        myCalc.powerOff();
    }
}
