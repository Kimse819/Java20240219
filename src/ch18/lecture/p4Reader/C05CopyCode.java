package ch18.lecture.p4Reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // todo: 텍스트 파일 복사
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용

        // 원본 파일과 대상 파일의 경로를 설정
        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try {
            // 원본 파일을 읽기 위한 FileReader와 대상 파일에 쓰기 위한 FileWriter 생성
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);
            try (reader; writer) {
                // 한 번에 읽어들일 데이터를 저장할 char 배열 생성
                char[] chars = new char[50];
                int len = 0;

                // 원본 파일로부터 데이터를 읽어서 대상 파일에 쓰기
                while ((len = reader.read(chars)) != -1) {
                    writer.write(chars, 0, len);
                }
            }
        } catch (IOException e) {
            // 입출력 예외가 발생할 경우 예외를 출력
            e.printStackTrace();
        }
    }
}
