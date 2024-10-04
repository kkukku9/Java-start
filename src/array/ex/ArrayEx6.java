package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = scanner.nextInt();

        int[] arr = new int[cnt];

        System.out.println(cnt + "개의 정수를 입력하세요:");

        for (int i = 0; i < cnt; i++) {
            int n = scanner.nextInt();
            arr[i] = n;
        }

        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
