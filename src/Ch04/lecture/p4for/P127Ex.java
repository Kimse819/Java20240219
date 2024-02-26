package Ch04.lecture.p4for;

public class P127Ex {
    public static void main(String[] args) {

        //1~9단 까지 구구단 출력
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            // System.out.println(STR."*** \{m} 단 ***);
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " X " + n + " = " + (m * n));
            }
        }
    }
}
