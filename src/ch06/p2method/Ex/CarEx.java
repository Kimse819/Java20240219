package ch06.p2method.Ex;

public class CarEx {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.setGas(5);

        if(mycar.isLeftGas()) {
            System.out.println("출발합니다!");

            mycar.run();
        }
        System.out.println("gas를 주입하세요!!");
    }
}
