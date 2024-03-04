package ch06.p2method;

public class C06CallByValue {
    public static void main(String[] args) {
        C06Car car = new C06Car();
        car.name = "tesla";
        car.printname();

        C06CarCarcenter center = new C06CarCarcenter();
        center.changeName(car);

        car.printname(); // Kia? or tesla?
    }
}

class C06CarCarcenter {
    void changeName(C06Car car){
        car = new C06Car(); //
        car.name = " kia";
    }
}
class C06Car {
    String name;
    void printname() {
        System.out.println(name);
    }
}
