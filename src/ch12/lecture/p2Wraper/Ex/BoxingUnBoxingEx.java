package ch12.lecture.p2Wraper.Ex;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        int value = obj;
        System.out.println("value: " + value);

        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
