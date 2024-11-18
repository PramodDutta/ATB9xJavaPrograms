package Nov.ex_18112024_Exceptions_Part2;

public class Lab196_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            //System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Not Printed");
        }

    }
}
