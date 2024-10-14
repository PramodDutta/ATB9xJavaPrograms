package Oct.ex_14102024_OperatorsP2;

public class Lab058_typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
       // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
    }
}
