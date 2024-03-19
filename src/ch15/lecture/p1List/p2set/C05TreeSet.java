package ch15.lecture.p1List.p2set;

import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        //TreeSet
        //Compare 또는, Comparable을 사용해 원소의 순서가 결정됨

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(12);
        set.add(20);
        set.add(15);

        System.out.println(set.size());
        System.out.println(set);

        set.forEach(System.out::println);


    }
}
