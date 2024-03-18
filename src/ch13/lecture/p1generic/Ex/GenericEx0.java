package ch13.lecture.p1generic.Ex;

public class GenericEx0 {
    public static void main(String[] args) {
        Box2<String> box1 = new ch13.lecture.p1generic.Ex.Box2<String>();
        box1.contnet = "안녕하세요";
        String str = box1.contnet;
        System.out.println(str);

        Box2<Integer> box2 = new Box2<>();
        box2.contnet = 100;
        int value = box2.contnet;
        System.out.println(value);
    }
}
