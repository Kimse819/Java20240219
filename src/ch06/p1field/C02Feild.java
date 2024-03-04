package ch06.p1field;

public class C02Feild {
    public static void main(String[] args) {
        //필드(field) : 객체가 가져야하는 값
        //
        // 09.Instance.png

        C02Car car1 = new C02Car();
        car1.color = "검은색";
        car1.weight = 999.99;

        C02Car car2 = new C02Car();
        car2.color = "흰색";
        car2.weight = 888.88;

        System.out.println(car1.color);
        System.out.println(car1.weight);

        System.out.println(car2.color);
        System.out.println(car2.weight);

    }

    //메소드(method) : 객체가 가져야하는 기능

}
