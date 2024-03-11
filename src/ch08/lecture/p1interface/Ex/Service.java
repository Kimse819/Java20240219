package ch08.lecture.p1interface.Ex;

public interface Service {
    default void defalutMethod1(){
        System.out.println("defalutMethod1 종속코드");
        defalutCommon();
    }

    default void defalutMethod2(){
        System.out.println("defalutMethod2 종속코드");
        defalutCommon();
    }

    private void defalutCommon(){
        System.out.println("defalutMethod 중복코드 A");
        System.out.println("defalutMethod 중복코드 B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속코드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod2 종속코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 종속코드C");
        System.out.println("staticMethod 종속코드D");
    }
}
