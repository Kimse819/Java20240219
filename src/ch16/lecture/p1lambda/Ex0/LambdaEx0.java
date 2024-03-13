package ch16.lecture.p1lambda.Ex0;

import ch16.lecture.p1lambda.ex1.Person;

public class LambdaEx0 {
    public static void main(String[] args) {
        Person0 person = new Person0();

        person.action(() ->{
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        person.action(()-> System.out.println("퇴근합니다."));
    }
}
