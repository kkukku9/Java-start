package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String userName = input.nextLine();
            // 이때 컴퓨터에는 userNameInputValue\n 으로 입력이 됨.
            // 근데 nextLine은 \n을 포함한 값을 모두 입력받음. (nextInput과 다른점)
            if (userName.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요:");
            int userAge = input.nextInt();
            // 이때 컴퓨터에는 userAgeInputValue\n 으로 입력이 됨.
            // 근데 nextInt는 \n을 빼고 10만 입력받음. 따라서 \n이 남아있게 됨.
            // 남아있는 \n은 while문이 돌면서 그 다음 userName값에 들어가게 됨. 거기서 오류가 발생.
            input.nextLine(); // 남아있는 개행 문자를 처리

            System.out.println("입력한 이름: " + userName + ", " + "나이: " + userAge);
        }
    }
}
