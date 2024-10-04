package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grades = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int row = 0; row < grades.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print(subject[col] + "점수:");
                int score = scanner.nextInt();
                grades[row][col] = score;
            }
        }
        for (int i = 0; i < grades.length; i++) {
            int totalGrade = 0;
            double avg;
            for (int j = 0; j < grades[i].length; j++) {
                totalGrade += grades[i][j];
            }
            avg = (double) totalGrade / grades[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + totalGrade + ", 평균: " + avg);

        }
    }

}
