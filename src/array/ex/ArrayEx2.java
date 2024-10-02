package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            //scanner.nextLine();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != 4) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
