package Ch02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 주석
        //한 줄 주석 -> ctrl + /
        //변수 : varialble -> 값을 저장하는 공간의 이름
//        변수 선언 : 저장공간을 만든다.
//        1)타입명 2)변수명  순서대로  --> 1)int 2)a --> int a;
//        int a; -> int 타입의 저장공간이 마련, 공간의 이름은 a,
        int a;
//        변수에 값 저장 (assignment, 할당함, 대입함)
//        변수명 = 값;  --> a = 10;
        a = 10;
        System.out.println(a);

        a = 9;
        System.out.println(a);
//        변수 b를 int타입으로 선언하고
//        변수 b에 100을 대입하고
//        변수 b 출력
        int b;
        b = 100;
        System.out.println(b);

//        변수명에 사용할 ㅜ 있는 문자들
//        영문 대소문자, 숫자, $, _
//        숫자로 시작할 수 없다.
        int c;
        int C;
        int $;
        int c_d;
        int _e;


//        변수명 작성 관습 : 1.소문자로 시작 2. 여러단어의 조합이면 각단어의 앞글자만 대문자로 표기
//        lowercamelcase
//        int age; 같은 변수명을 다시 선언할 수 없다,
        int addressOfjane;
        int address;

//        자바 키워드는(예약어) 는 변수명으로사용할 수 없다.


    }
}
