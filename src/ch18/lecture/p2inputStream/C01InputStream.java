package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        String filename = "temp/test3.db";
        try{
            try {
                InputStream is = new FileInputStream(filename);

                try(is) {
                   int data1 = is.read();
                   int data2 = is.read();
                   int data3 = is.read();
                   int data4 = is.read();

                    System.out.println("data1 =" + data1);
                    System.out.println("data2 =" + data2);
                    System.out.println("data3 =" + data3);
                    System.out.println("data4 =" + data4);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
