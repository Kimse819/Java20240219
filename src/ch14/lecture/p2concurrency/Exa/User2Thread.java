package ch14.lecture.p2concurrency.Exa;

public class User2Thread extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory2(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
