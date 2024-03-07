package ch07.p2Polymorphism;

public class C01Override {
    public static void main(String[] args) {
        C01GoldFish goldFish = new C01GoldFish();

    }
}

class C01Animal{
    public void breathe() {
        System.out.println("호흡합니다.");
    }
}

class C01GoldFish extends C01Animal{
    public void breathe() {
        System.out.println("아가미로 호흡합니다.");
    }
}

class C01Cat extends C01Animal{

}
