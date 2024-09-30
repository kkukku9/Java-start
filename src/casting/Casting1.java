package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // long에 int넣기 -> 가능.
        System.out.println("longValue = " + longValue);
        
        doubleValue = intValue; //double에 int넣기 -> 가능.
        System.out.println("doubleValue = " + doubleValue);
        
        doubleValue = 20L; //double에 long넣기 -> 가능
        System.out.println("doubleValue = " + doubleValue);
    }
}
