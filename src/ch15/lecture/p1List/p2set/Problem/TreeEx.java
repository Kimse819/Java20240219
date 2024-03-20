package ch15.lecture.p1List.p2set.Problem;

import java.util.TreeSet;

public class TreeEx {
    public static void main(String[] args) {
        TreeSet<Stuent> treeSet = new TreeSet<Stuent>();
        treeSet.add(new Stuent("blue", 96));
        treeSet.add(new Stuent("hong", 86));
        treeSet.add(new Stuent("white", 92));

        Stuent stuent = treeSet.last();
        System.out.println("최고점수: " + stuent.score);
        System.out.println("최고점수를 받은 아이디: " + stuent.id);
    }
}
