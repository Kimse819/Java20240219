package ch08.lecture.p1interface.Ex;

public class Bus implements Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달랍니다.");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}
