package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C08OutputStream {
    public static void main(String[] args) {
        String filename = "temp/output8.data";

        try {
            OutputStream os = new FileOutputStream(filename);
            try (os) {
                os.write(23074);
                byte[] data = new byte[10];

                os.write(data); //10bytes 쓰기
                os.write(data); //10bytes 쓰기
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}

