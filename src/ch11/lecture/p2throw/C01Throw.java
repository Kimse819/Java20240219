package ch11.lecture.p2throw;

public class C01Throw {
    public static void main(String[] args) {
        RuntimeException e = new  RuntimeException();

        //throw : 예외 던지기
        throw e;

//        System.out.println("asdasd"); -> throw 다음 코드는 실행 안됨

    }
}
