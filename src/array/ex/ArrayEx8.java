package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요:");
        int studentsCnt = scanner.nextInt();

        int[][] grade = new int[studentsCnt][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int row = 0; row < grade.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < grade[row].length; col++) {
                System.out.print(subject[col] + "점수:");
                int score = scanner.nextInt();
                grade[row][col] = score;
            }
        }
        for (int i = 0; i < grade.length; i++) {
            int totalGrade = 0;
            double avg;
            for (int j = 0; j < grade[i].length; j++) {
                totalGrade += grade[i][j];
            }
            avg = (double) totalGrade / grade[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + totalGrade + ", 평균: " + avg);

        }
    }

}
