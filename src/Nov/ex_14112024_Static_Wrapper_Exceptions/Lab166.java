package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab166 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        Automation t2 = new Automation();
        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}

class Automation{
    static String driver = "Chrome";



}
