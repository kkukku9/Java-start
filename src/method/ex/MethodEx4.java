package method.ex;

import scanner.Scanner1;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            menu();
            System.out.print("선택: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.print("입금액을 입력하세요:");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (num == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (num == 3) {
                checkBalance(balance);
            } else if (num == 4) {
                logOff();
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요");
                continue;
            }
        }

    }

    public static void menu() {
        System.out.println("----------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("----------------------------------------");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
            return balance;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }

    public static void checkBalance(int balance) {
        System.out.println("현재 잔액: " + balance + "원");
        return;
    }

    public static void logOff() {
        System.out.println("시스템을 종료합니다.");
    }
}
