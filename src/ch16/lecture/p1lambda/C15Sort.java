package ch16.lecture.p1lambda;

import java.util.Arrays;
import java.util.Comparator;

public class C15Sort {
    public static void main(String[] args) {
        String[] names = {"son", "kwang", "alex", "go", "johnes"};

        System.out.println("정렬전");
        System.out.println(Arrays.toString(names));

        // 문자열을 사전순으로 정렬하는 Comparator를 전달하여 정렬
        sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("문자 코드 기준 정렬후");
        System.out.println(Arrays.toString(names));

        // 문자열의 길이를 기준으로 정렬하는 Comparator를 전달하여 정렬
        sort(names, (s1, s2) -> s1.length() - s2.length());
        System.out.println("글자 수 기준 정렬 후 ");
        System.out.println(Arrays.toString(names));

        // 문자열의 길이를 기준으로 큰 순서로 정렬하는 Comparator를 전달하여 정렬
        sort(names, (s1, s2) -> s2.length() - s1.length());
        System.out.println("글자 수 기준 큰거 부터 정렬 후 ");
        System.out.println(Arrays.toString(names));

        // 문자열을 사전순의 역순으로 정렬하는 Comparator를 전달하여 정렬
        sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("문자 코드 역순 정렬 후 ");
        System.out.println(Arrays.toString(names));
    }

    // 선택 정렬을 이용하여 문자열 배열을 정렬하는 메서드
    private static void sort(String[] arr, Comparator<String> comparator) {
        int loop = arr.length;

        for (int current = 0; current < loop; current++) {
            String min = arr[current];
            int minIndex = current;

            // 선택한 요소와 나머지 요소를 비교하여 최소값을 찾음
            for (int i = current; i < loop; i++) {
                int result = comparator.compare(min, arr[i]);
                if (result > 0) {
                    min = arr[i];
                    minIndex = i;
                }
            }

            // 최소값을 현재 위치로 이동
            String temp = arr[current];
            arr[current] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
