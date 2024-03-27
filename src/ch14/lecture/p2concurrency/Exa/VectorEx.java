package ch14.lecture.p2concurrency.Exa;

import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            @Override
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));

                }
            }
        };


    }
}
