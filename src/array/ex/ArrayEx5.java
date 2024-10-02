package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();

        int[] arr = new int[inputCount];
        int sum = 0;
        
        System.out.println(inputCount + "개의 정수를 입력하세요:");
        for (int i = 0; i <= inputCount -1 ; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
            sum += num;
        }

        double avg = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
