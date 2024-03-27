package ch14.lecture.Ex;

import ch11.lecture.p3Custom.Exam.InstuffcientExcetion;

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1 ~ 100합: " + sumThread.getSum());
    }
}
