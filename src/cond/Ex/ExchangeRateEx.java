package cond.Ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 212415334;
        int won = 1315;
        int mon = dollar * won;
        if (dollar <= 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + mon + "입니다.");
        }
    }
}
