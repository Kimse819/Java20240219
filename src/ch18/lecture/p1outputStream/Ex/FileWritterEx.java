package ch18.lecture.p1outputStream.Ex;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEx {
    public static void main(String[] args) {
        try(FileWritter fw = new FileWritter("file.txt");){
            fw.write("java");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
