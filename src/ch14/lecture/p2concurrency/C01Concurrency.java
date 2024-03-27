package ch14.lecture.p2concurrency;

public class C01Concurrency {
    public static void main(String[] args) {
        MyRun1 r = new MyRun1();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        System.out.println("r.getValue() = " +r.getValue());

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("r.getValue() = " +r.getValue());

    }
}

class MyRun1 implements Runnable{
    private long value;
    public long getValue(){
     return value;
    }
    @Override
    public void run(){
        for (int i = 0; i < 30000; i++) {
            value++;
        }
    }
}
