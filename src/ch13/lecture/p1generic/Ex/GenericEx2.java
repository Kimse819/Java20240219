package ch13.lecture.p1generic.Ex;

public class GenericEx2 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.content = "100";

        Box1 box2 = new Box1();
        box2.content = "100";

        Box1 box3 = new Box1();
        box3.content = "100";

        boolean result1 = box1.compare(box2);
        System.out.println("result: " + result1);

        boolean result2 = box1.compare(box3);
        System.out.println("result: " + result2);
    }
}
