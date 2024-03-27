package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        //InputStream : 프로그램 외부입력을 바이트 단위로 받기 위한 객체의 클래스
        //OutputStram : 프로그램 외부 출력을 바이트 단위로 하기 위한 객체의 클래스

        //Reader : 문자단위 입력 스트림
        //Writer : 문자단위 출력 스트림

        String fileNmae = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileNmae);
        os.write(99);
    }
}
