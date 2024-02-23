package Ch04.lecture;

import java.util.Random;
import java.util.Scanner;

public class Co6RSP {
    public static void main(String[] args) {
        //가위바위보 게임 제작
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요: ");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        //코드 작성
        System.out.println("user = " + user);
        System.out.println("computer = " + computer);

        //누가 이겼는지
        if (user > computer) {
            System.out.println("user가 이겼습니다!");
        } else if (user == computer) {
            System.out.println("비겼습니다!");
        } else {
            System.out.println("computer가 이겼습니다!");
        }

    }
}
