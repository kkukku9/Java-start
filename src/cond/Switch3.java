package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                //break문이 없으면, 원래 여기서 break를 만나서 끝나야하는데 case3까지 가버리게된다.
                // 즉, braek가 없다면, case 2이후에 모든 코드가 전부 실행되게 되는 것임. (break를 만나거나 switch가 끝날때까지)
            case 3:
                coupon = 3000;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급 받은 쿠폰 : " + coupon);

    }
}
