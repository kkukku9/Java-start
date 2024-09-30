package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str;
            System.out.print("문자열을 입력하세요:");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            } else {
                System.out.println(str);
            }
        }
    }
}
