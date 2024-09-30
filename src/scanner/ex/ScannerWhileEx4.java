package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int totalPrice = 0;
        //option = scanner.nextInt()
        while (true) {
            System.out.println("1.상품 입력, 2.결제, 3.프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("상품명을 입력하세요:");
                String modelName = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요:");
                int modelPrice = scanner.nextInt();

                System.out.println("구매 수량을 입력하세요:");
                int modelQuan = scanner.nextInt();

                int sum = modelPrice * modelQuan;
                totalPrice += sum;

                System.out.println("상품명:" + modelName + " 가격:" + modelPrice + " 수량:" + modelQuan + " 합계:" + sum);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                scanner.nextLine();
                System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
            }

        }
    }
}
