package ch14.lecture.p2concurrency.Exa;

import ch11.lecture.p3Custom.Exam.InstuffcientExcetion;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(2000);
        System.out.println("Calculator.setMemory1 = " + this.memory);
    }

    public void setMemory2(int memory) throws InterruptedException {
        synchronized (this) {
            this.memory = memory;
            Thread.sleep(2000);
            System.out.println("Calculator.setMemory2 = " + this.memory);
        }
    }
}


