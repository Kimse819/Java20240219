package ch02;

public class StringExample {
    public static void main(String[] args) {
        String name = "김세현";
        String job = "프로그래머";
        System.out.println("이름 = " + name);
        System.out.println("직업 = " + job);

        String str = "나는\"자바\"를 베웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.print("나는\n"); // print와 println의 차이 생각
        System.out.print("자바를\n");
        System.out.print("배웁니다.");

    }
}
