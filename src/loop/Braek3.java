package loop;

public class Braek3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("sum이 10보다 크면 종료. i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
