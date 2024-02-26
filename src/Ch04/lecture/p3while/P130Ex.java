package Ch04.lecture.p3while;

public class P130Ex {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("i~" + (i - 1) + "합 : " + sum);
//        System.out.println(STR."1~{i - 1 합 : \sum");
    }
}
