package ch18.lecture.p2inputStream.Ex;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        String inputFileName = "temp/dog2.jpeg";
        String outputFileName = "temp/dog2-copy.jpeg";

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(inputFileName);
            os = new FileOutputStream(outputFileName);

            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            os.flush();
            os.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("복사가 완료 되었습니다.");
    }
}
