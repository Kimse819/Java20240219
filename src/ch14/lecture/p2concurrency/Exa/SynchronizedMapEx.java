package ch14.lecture.p2concurrency.Exa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
    public static void main(String[] args) {
        Map<Integer, String > map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread() {
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };


    }
}
