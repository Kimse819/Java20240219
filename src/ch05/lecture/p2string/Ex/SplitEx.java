package ch05.lecture.p2string.Ex;

import java.awt.*;

public class SplitEx {
    public static void main(String[] args) {
        String board = "1.자바 학습, 참조 타입 String을 학습합니다., Sting 학습, 김세현 ";

        String[] tokens = board.split(",");

        System.out.println("번호 = " + tokens[0]);
        System.out.println("제목 = " + tokens[1]);
        System.out.println("내용 = " + tokens[2]);
        System.out.println("성명 = " + tokens[3]); // 수정된 부분
        System.out.println();

        for(int i = 0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
