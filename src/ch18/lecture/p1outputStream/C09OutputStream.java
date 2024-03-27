package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String filename = "temp/output9.data";
        try {
            OutputStream os = new FileOutputStream(filename);

            os.write(23234);

            byte[] data = new byte[10];

            os.write(data);;
            os.write(data, 0, 10);
            os.write(data, 5,3);

        }catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
