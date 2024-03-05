package ch06.p4Package.package2;

import ch06.p4Package.package1.C01Myclass;
public class C02Package {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스는 full name 사용해야 함
        // import 하면 short name 사용 가능
        C01Myclass o1 = new C01Myclass();
    }
}
