package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int 이므로 int타입으로 결과가 나온다.
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        // int / int 이므로 int타입으로 결과가 나온다.
        // int타입으로 나온 결과를 double에 대입해야 하므로 자동 형변환이 발생하여 1.0(double)로 형변환 되었다.
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        // double / int 이므로, double / double로 형변환이 발생한다.
        // double / double이므로 결과값이 double형으로 나온다.
        System.out.println("div3 = " + div3); // 1.5
        
        double div4 = (double) 3 / 2;
        // 명시적 형변환을 사용하여 double / int 이므로 double / double로 자동 형변환이 일어나게 된다.
        // 따라서 결과값이 double형으로 나온다.
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;  //a를 일단 double형으로 캐스팅 한 후 나누기
        System.out.println("result = " + result); // 1.5
    }
}
