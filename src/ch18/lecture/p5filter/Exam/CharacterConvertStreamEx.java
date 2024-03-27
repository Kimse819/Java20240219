package ch18.lecture.p5filter.Exam;

import static java.lang.module.ModuleDescriptor.read;
import static java.nio.file.Files.write;

public class CharacterConvertStreamEx {
    public static void main(String[] args) throws Exception{
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }


}
