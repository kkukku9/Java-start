package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cnt++;
                if (cnt == 10) {
                    break;
                }
            }
        }

    }
}
