package ch06.p7access.Ex;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[100]; // 길이가 100인 Account 배열 선언

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    // 계좌 생성 메서드
    private static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.nextLine();
        System.out.print("잔액 입력: ");
        int balance = scanner.nextInt();

        Account newAccount = new Account(accountNumber, balance);

        // 계좌 배열에 새 계좌 추가
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록 출력 메서드
    private static void accountList() {
        System.out.println("----------계좌 목록----------");
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                System.out.println("계좌번호: " + accounts[i].getAccountNumber() + ", 잔액: " + accounts[i].getBalance());
            }
        }
    }

    // 예금 메서드
    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금할 계좌번호 입력: ");
        String accountNumber = scanner.nextLine();
        System.out.print("입금할 금액 입력: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
                int currentBalance = accounts[i].getBalance();
                accounts[i].setBalance(currentBalance + amount);
                System.out.println(amount + "원이 입금되었습니다.");
                return;
            }
        }
        System.out.println("해당하는 계좌가 없습니다.");
    }

    // 출금 메서드
    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금할 계좌번호 입력: ");
        String accountNumber = scanner.nextLine();
        System.out.print("출금할 금액 입력: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
                int currentBalance = accounts[i].getBalance();
                if (currentBalance >= amount) {
                    accounts[i].setBalance(currentBalance - amount);
                    System.out.println(amount + "원이 출금되었습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
                return;
            }
        }
        System.out.println("해당하는 계좌가 없습니다.");
    }

}

