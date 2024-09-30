package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 2.5;
        int intValue = 0;

        //intValue = doubleValue; 컴파일 오류 발생
        intValue = (int) doubleValue; //직접 형변환, 강제 형변환, 명시적 형변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
        //doubleValue를 직접 형변환 하고 나서도 doubleValue라는 변수 자체는 여전히 double형이다.
    }
}
