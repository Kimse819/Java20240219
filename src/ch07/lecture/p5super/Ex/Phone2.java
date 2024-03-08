package ch07.lecture.p5super.Ex;

public class Phone2 {
    public String model;
    public String color;

    public Phone2(String model, String color){
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color)생성자 실행됨");
    }
}
