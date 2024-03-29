package ch05.lecture.p1array.Ex;

public class ArrayCreateByValueListEx2 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0] = " + season[0]);
        System.out.println("season[1] = " + season[1]);
        System.out.println("season[2] = " + season[2]);
        System.out.println("season[3] = " + season[3]);

        //인덱스 1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] = " + season[1]);
        System.out.println();

        //배열변수 선언과 배열 생성
        int[] scores = { 83, 90, 89 };

        //총합과 평균구하기
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += scores[i];
        }
        System.out.println("총합 = " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 = " + avg);
    }
}
