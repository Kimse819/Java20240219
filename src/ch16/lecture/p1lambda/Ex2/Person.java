package ch16.lecture.p1lambda.Ex2;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable){
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}
