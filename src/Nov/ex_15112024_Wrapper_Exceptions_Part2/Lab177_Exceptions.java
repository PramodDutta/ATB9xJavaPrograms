package Nov.ex_15112024_Wrapper_Exceptions_Part2;

public class Lab177_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        s1.trim();
        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // jvm - compile -> jvm knows at the Runtime -> Terminated the program.
    }
}
