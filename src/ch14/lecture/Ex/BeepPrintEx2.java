package ch14.lecture.Ex;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintEx2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    }catch (Exception e){}
                }
            }
        };
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
