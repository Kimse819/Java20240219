package ch15.lecture.p1List;

import java.util.ArrayList;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {95, 86, 92},
                {95, 58, 79, 88, 44},
        };
        System.out.println(array[1][1]);
        System.out.println(array[2][2]);
        System.out.println(array[1][0]);

        List<List<Integer>> list = new ArrayList<>(); // ArrayList로 list 객체 생성 및 초기화

        // 각 리스트에 데이터 추가
        list.add(new ArrayList<>(List.of(95, 86)));
        list.add(new ArrayList<>(List.of(95, 86, 92)));
        list.add(new ArrayList<>(List.of(95, 58, 79, 88, 44)));

        // 인덱스로 리스트에 접근하여 데이터 출력
        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 79
        System.out.println(list.get(1).get(0)); // 95
    }
}
