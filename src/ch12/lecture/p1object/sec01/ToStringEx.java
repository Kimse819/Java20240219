package ch12.lecture.p1object.sec01;

public class ToStringEx {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼정전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);
                                        // --> toString() 메소드 호출 -->System.out.println(); 부분
        System.out.println(myPhone);

    }
}