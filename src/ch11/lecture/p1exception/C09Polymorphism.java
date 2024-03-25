package ch11.lecture.p1exception;

public class C09Polymorphism {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.string");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
