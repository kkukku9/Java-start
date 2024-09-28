package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수 (정수 리터럴은 int를 기본으로 사용함.)
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32768 ~ 32,767
        int i = 2147483647; // -2147483648 ~ 2147483647 (약 20억)
        //-9,223,372,036,854,775,808 ~ -9,223,372,036,854,775,807
        long l = 9223372036854775087L; //뒤에 L이나 l을 꼭 붙여줘야함

        //실수 (실수 리터럴은 double을 기본으로 사용함)
        float f = 10.0f; //뒤에 f를 꼭 붙여줘야함 (실수의 기본 리터럴 형식이 double이기 때문)
        double d = 10.0;
    }
}
