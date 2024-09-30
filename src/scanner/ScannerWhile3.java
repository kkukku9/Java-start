package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        System.out.println("0을 입력하면 입력이 종료됩니다.");
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요:");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("입력하신 수들의 합은 " + sum + "입니다.");
    }
}
