package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50,};

        int total = 0;
        for (int col = 0; col < students.length; col++) {
            total += students[col];
        }
        /*
        for (int student : students) {
            total += student;
        }
        */

        double avg = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
