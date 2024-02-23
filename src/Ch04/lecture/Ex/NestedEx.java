package Ch04.lecture.Ex;

public class NestedEx {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81; //81 ~ 100
        System.out.println("score = " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 95) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("grade = " + grade);
    }
}
