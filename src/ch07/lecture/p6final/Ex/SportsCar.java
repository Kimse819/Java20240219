package ch07.lecture.p6final.Ex;

public class SportsCar extends Car{
    @Override
    public void speedup(){
        speed += 10;
    }
//    @Override  ->오버라이딩을 할 수 없음
//    public void stop(){
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
