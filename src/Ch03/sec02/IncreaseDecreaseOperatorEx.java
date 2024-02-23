package Ch03.sec02;

public class IncreaseDecreaseOperatorEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        //1번
        x++;
        ++x;
        System.out.println("x = " + x);

        //2번
        System.out.println("----------------");
        y--;
        --y;
        System.out.println("y = " + y);

        //3번
        System.out.println("----------------");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        //4번
        System.out.println("----------------");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        //5번
        System.out.println("----------------");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
