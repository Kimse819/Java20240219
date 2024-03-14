package ch12.lecture.p1object.Exam;

public class EqualsEx {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)){
            System.out.println("obj1은 obj2와 동등합니다.");
        }else {
            System.out.println("obj1은 obj2와 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1은 obj3과 동등합니다.");
        }else {
            System.out.println("obj1은 obj3과 동등하지 않습니다.");
        }

    }
}
