package ch06.package4;

import ch06.package3.*;
public class C {
    public C(){
        A a = new A();

        a.feild1 = 1;
//        a.feild2 = 1; -> defalut 필드 접근 불가(컴파일 에러)
//        a.feild3 = 1; -> private 필드 접근 불가(컴파일 에러)

        a.method1();
    }
}
