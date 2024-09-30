package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String status;

        System.out.print("하나의 정수를 입력하세요:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            status = "짝수";
        } else {
            status = "홀수";
        }

        System.out.println("입력하신 숫자 " + num + "은 " + status + "입니다.");
    }
}
