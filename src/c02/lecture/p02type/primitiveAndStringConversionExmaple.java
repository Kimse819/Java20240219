package c02.lecture.p02type;

public class primitiveAndStringConversionExmaple {
    public static void main(String[] args) {
        //1번 에시
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        //2번 예시  ( 1, 2번 결과는 갗ㅡㅁ)
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        //확인문제 10번 (p.74)
        
    }
}
