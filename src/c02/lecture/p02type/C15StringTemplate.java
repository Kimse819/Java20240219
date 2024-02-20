package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        //java21
        //String template

        String name = "jane";
        String age = "50";

        String desc = " my name is " + name + "and age is " + age; //1번
        System.out.println(desc);

        String desc2 = String.format("my name is %s and age is %s", name, age); //2번
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}"; //3번
        System.out.println(desc3);

        //
        String address = "서울";
        String country = "한국";

        String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다.";
        System.out.println(desc4);
    }
}
