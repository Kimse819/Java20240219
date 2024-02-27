package ch05.lecture.p1array.Ex;

public class Exercise07 {

    //p.199-7번 또 다른 풀이
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        // 최대값을 저장할 변수 선언
        // 초기값은 배열의 첫번째 원소
        int max = array[0];

        // 배열의 모든 원소를 max와 비교해서
        // max보다 크면 max값을 교체
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }

        System.out.println("max = " + max);
    }
}
