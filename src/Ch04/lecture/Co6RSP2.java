package Ch04.lecture;

import java.util.Random;
import java.util.Scanner;

public class Co6RSP2 {
    public static void main(String[] args) {
        // 가위바위보 게임 제작
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요: ");

        String userChoice = scanner.nextLine(); // 사용자의 선택을 문자열로 받음
        int user;

        // 사용자가 선택한 문자열에 따라 숫자로 변환
        if (userChoice.equals("가위")) {
            user = 1;
        } else if (userChoice.equals("바위")) {
            user = 2;
        } else if (userChoice.equals("보")) {
            user = 3;
        } else {
            System.out.println("잘못된 입력입니다. 가위, 바위, 보 중에서 선택해주세요.");
            return; // 잘못된 입력이면 프로그램 종료
        }

        int computer = random.nextInt(3) + 1; // 1 이상 4 미만의 난수 생성

        System.out.println("user = " + userChoice);
        System.out.println("computer = " + (computer == 1 ? "가위" : computer == 2 ? "바위" : "보"));

        // 누가 이겼는지
        if (user == computer) {
            System.out.println("비겼습니다!");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("user가 이겼습니다!");
        } else {
            System.out.println("computer가 이겼습니다!");
        }
    }
}
