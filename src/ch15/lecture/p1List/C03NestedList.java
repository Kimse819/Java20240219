package ch15.lecture.p1List;

import java.util.ArrayList;
import java.util.List;

public class C03NestedList {
    //원소가 String
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");

        //원소가 List
        List<List<String>> list2 = new ArrayList<>();
        list2.add(new ArrayList<>());
        list2.add(new ArrayList<>());

        List<String> sublist1 = list2.get(0);
        sublist1.add("react");
        sublist1.add("vue");

        list2.get(1).add("javascript");
        list2.get(1).add("rust");

        System.out.println(list2.get(0).get(1)); //vue 출력
        System.out.println(list2.get(1).get(0)); //javascript 출력
        System.out.println(list2.get(1).get(1)); // rust 출력
    }
}
