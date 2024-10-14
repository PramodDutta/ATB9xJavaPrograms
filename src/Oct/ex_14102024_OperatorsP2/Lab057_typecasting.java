package Oct.ex_14102024_OperatorsP2;

public class Lab057_typecasting {
    public static void main(String[] args) {
        // Type Casting -
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // Valid -> Implicit Casting - JVM
        int a1 = (int)b; // Valid -> Explicit Casting - JVM

        // Narrowing - Converting - Large data type - small
        int val = 200;
        //byte b2 = val; // Invalid - Implicit - JVM
        byte b3 = (byte)val; // Valid -> Explicit - User

    }
}
