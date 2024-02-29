package ch05.lecture.p1array.Ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = null; // 학생들의 점수 배열
        int studentCount = 0; // 학생 수

        System.out.println("-----------------------------------------");
        System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
        System.out.println("-----------------------------------------");

        while (true) {
            System.out.print("선택> ");
            int menu = scanner.nextInt(); // 메뉴 선택

            if (menu == 1) {
                System.out.print("학생 수 입력: ");
                studentCount = scanner.nextInt(); // 학생 수 입력
                scores = new int[studentCount]; // 학생 수에 맞게 배열 초기화
            } else if (menu == 2) {
                // 학생 수만큼 점수 입력 받음
                for (int i = 0; i < studentCount; i++) {
                    System.out.print((i + 1) + "번 학생 점수 입력: ");
                    scores[i] = scanner.nextInt();
                }
            } else if (menu == 3) {
                // 입력된 점수 리스트 출력
                System.out.println("점수 리스트:");
                for (int i = 0; i < studentCount; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + scores[i]);
                }
            } else if (menu == 4) {
                // 점수 분석: 최고점, 최저점, 평균 점수 출력
                int maxScore = scores[0];
                int minScore = scores[0];
                int totalScore = 0;

                for (int score : scores) {
                    if (score > maxScore) {
                        maxScore = score;
                    }
                    if (score < minScore) {
                        minScore = score;
                    }
                    totalScore += score;
                }

                double averageScore = (double) totalScore / studentCount;

                System.out.println("최고 점수: " + maxScore);
                System.out.println("최저 점수: " + minScore);
                System.out.println("평균 점수: " + averageScore);
            } else if (menu == 5) {
                // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();
    }
}




