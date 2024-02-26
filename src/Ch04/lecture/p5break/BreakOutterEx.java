package Ch04.lecture.p5break;

public class BreakOutterEx {
    public static void main(String[] args) {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'A'; lower <= 'Z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로글매 실험 종료");
    }
}
