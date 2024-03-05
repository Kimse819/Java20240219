package ch06.p4Package.package1;

public class C01Package {
    public static void main(String[] args) {
        ch06.p4Package.package1.C01Myclass o1
                = new ch06.p4Package.package1.C01Myclass();

        // 같은 패키지에 있는 클래스는 short name 사용
        C01Myclass o2 = new C01Myclass();
    }
}
