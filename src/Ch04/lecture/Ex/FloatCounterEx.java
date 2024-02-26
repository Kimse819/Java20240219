package Ch04.lecture.Ex;

public class FloatCounterEx {
    public static void main(String[] args) {
        //for문의 index변수는 정수형으로
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }
}
