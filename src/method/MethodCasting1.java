package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); //double을 int에 대입하므로 컴파일 오류
        printNumber((int) number); //명시적 형변환을 사용해 double을 int형으로 변환

    }

    public static void printNumber(int n) {
        //number는 double형이고 n은 int 형인데, 더 큰 double형인 number를 더 작은 int형인 n에 담으려고 하니까 오류가 나는 것이다.
        System.out.println(("숫자: " + n));
    }
}
