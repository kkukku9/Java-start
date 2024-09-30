package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //temp의 생존 범위가 쓸데 없이 너무 길어서 비효율적인 메모리 사용하게됨.
                      // 또한, if코드 블록에서만 필요한 temp인데 여기서 선언해줘서 코드의 복잡성이 증가됨.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
