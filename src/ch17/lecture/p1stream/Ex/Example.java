package ch17.lecture.p1stream.Ex;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "this is a java book",
                "Lamba Expression",
                "Java8 supports lambda expression"
        );

        // 스트림을 이용하여 중복 제거 후 길이가 3의 배수에서 나머지가 1인 문자열 필터링 후 출력
        list.stream()
                .distinct()
                .filter(e -> e.length() % 1 == 0)
                .filter(e -> !e.equals("Lamba Expression")) // "Lamba Expression"이 아닌 것만 필터링
                .forEach(System.out::println);
    }
}
