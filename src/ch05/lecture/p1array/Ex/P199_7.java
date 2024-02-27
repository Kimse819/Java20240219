package ch05.lecture.p1array.Ex;

public class P199_7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2}; // 정수 배열

        int max = array[0]; // 최댓값을 첫 번째 요소로 초기화

        // 배열을 순회하면서 최댓값을 찾음
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 현재 요소가 최댓값보다 크면 최댓값을 업데이트
            }
        }

        System.out.println("최댓값: " + max);
    }
}
