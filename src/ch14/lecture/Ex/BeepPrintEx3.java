package ch14.lecture.Ex;

import java.awt.*;

public class BeepPrintEx3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        });
        thread.start();
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("띵");
            }
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
        }
    }
}
