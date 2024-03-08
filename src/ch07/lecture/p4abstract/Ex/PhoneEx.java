package ch07.lecture.p4abstract.Ex;

public class PhoneEx {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();


    }
}
