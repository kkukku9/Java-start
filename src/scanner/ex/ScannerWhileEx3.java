package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg;
        int inputCount = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        /*
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            inputCount++;
        }
        */
        int num;
        while ((num = scanner.nextInt()) != -1) { //이런 방식으로도 할 수 있으니 알아둘 것. 입력 받을때 바로 체크해버리기.
            sum += num;
            inputCount++;
        }

        avg = (double) sum / inputCount;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);

    }
}
