package ch07.lecture.p3casting;

public class C02Casting {
    C02Animal animal1 = new C02Animal();
    C02Tiger tiger1 = (C02Tiger) animal1; //ok
    //컴파일 오류
    //
    C02Cat cat1 = (C02Cat) animal1;
}
class C02Animal {

}
class C02Tiger extends C02Animal{

}

class C02Cat extends C02Animal{

}


