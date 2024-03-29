package ch18.lecture.p4Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        // InputStream : 바이트 단위 입력 스트림
        // Reader : 문자 단위 입력 스트림

        Reader reader = new FileReader("temp/output2.txt");
        int read1 = reader.read(); // 걱
        int read2 = reader.read(); // 한
        int read3 = reader.read(); // z

        System.out.println("read1 = " + read1);
        System.out.println("read2 = " + read2);
        System.out.println("read3 = " + read3);

        System.out.println("read1 = " + (char) read1);
        System.out.println("read2 = " + (char) read2);
        System.out.println("read3 = " + (char) read3);

    }
}
