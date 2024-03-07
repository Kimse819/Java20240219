package ch12.sec03.exam04;

public class RecordEx {
    public static void main(String[] args) {
        Member m = new Member("winter", "복숭아", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "복숭아", 25);
        Member m2 = new Member("winter", "복숭아", 25);
        System.out.println("m1.hashcode() : " + m2.hashCode() );
        System.out.println("m1.hashcode() : " + m1.hashCode() );
        System.out.println("m1.hashcode() : " + m1.equals(m2));
    }
}
