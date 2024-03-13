package ch16.lecture.p1lambda;

public class C09Lambda {
    public static void main(String[] args) {
        C09MyInterface obj1 = new C09MyInterface() {
            @Override
            public int method() {
                System.out.println("statement...");
                return 0;
            }
        };

        C09MyInterface obj2 = () -> {
            System.out.println("statement...");
            return 0;
        };
        C09MyInterface obj3 = () -> {
            return 0;
        };

        C09MyInterface obj4 = () -> 0;
        ;
    }

    @FunctionalInterface
    interface C09MyInterface {
        int method();
    }
}