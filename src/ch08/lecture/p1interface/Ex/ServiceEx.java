package ch08.lecture.p1interface.Ex;

public class ServiceEx {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defalutMethod1();
        System.out.println();
        service.defalutMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
