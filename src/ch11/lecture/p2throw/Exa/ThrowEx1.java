package ch11.lecture.p2throw.Exa;


public class ThrowEx1 {
    public static void main(String[] args) {
        try{
            findClass();
        }catch (ClassNotFoundException e) {
            System.out.println("예외처리:" + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
