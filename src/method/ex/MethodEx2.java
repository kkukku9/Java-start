package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        /*
        String message = "Hello world!";

        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
         */
        reMsg(1);
        reMsg(3);
        reMsg(7);
    }

    public static void reMsg(int rep) {
        for (int i = 0; i < rep; i++) {
            System.out.println("Hello world!");
        }
    }
}
