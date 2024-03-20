package ch15.lecture.p1List.p2set.Ex;

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김수현", 32));
        treeSet.add(new Person("김지원", 30));

        for (Person person : treeSet){
            System.out.println(person.name + ":" + person.age);
        }
    }
}
