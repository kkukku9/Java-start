package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        balance = deposit(balance, 1000);

        // 출금 2000
        balance = withdraw(balance, 2000);
    }

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
            return balance;
        } else {
            System.out.println(money + "원을 출금하여 했으나 잔액이 부족합니다.");
            return balance;
        }
    }
}
