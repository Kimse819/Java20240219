package ch12.lecture.p1object.Exam;

public class Member0 {
    private String id;
    private String name;

    public Member0(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
     return id +": " + name;
    }


}
