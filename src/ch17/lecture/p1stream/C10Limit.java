package ch17.lecture.p1stream;

import java.util.Comparator;
import java.util.List;

public class C10Limit {
    public static void main(String[] args) {
        // limit: 주어진 수 만큼의 요소의 스트림을 리턴

        List<Integer> list = List.of(8, 2, 5, 1, 10, 9, 2, 1, 0);

        // 처음 5개 요소 출력
        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();

        // 정렬 후 처음 3개 요소 출력
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        // 정렬 후 중복 제거하고 처음 3개 요소 출력
        list.stream()
                .sorted()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        // 내림차순 정렬 후 중복 제거하고 처음 3개 요소 출력
        list.stream()
                .sorted((a, b) -> b - a) // 내림차순 정렬
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        // 내림차순 정렬 후 중복 제거하고 처음 3개 요소 출력 (Comparator.reverseOrder() 사용)
        list.stream()
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}
