package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scaaner = new Scanner(System.in);
        double sum;

        System.out.print("첫 번째 수를 입력하세요:");
        double num1 = scaaner.nextDouble();

        System.out.print("두 번째 수를 입력하세요:");
        double num2 = scaaner.nextDouble();

        sum = num1 + num2;
        System.out.println("두 수의 합은 " + sum + "입니다.");
    }
}
