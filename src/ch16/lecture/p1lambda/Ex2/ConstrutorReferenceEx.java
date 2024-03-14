package ch16.lecture.p1lambda.Ex2;

public class ConstrutorReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println();

        Member m2 = person.getMember2(Member :: new);
        System.out.println(m2);
    }
}
