package Nov.ex_15112024_Wrapper_Exceptions_Part2;

public class Lab178_Exceptions_Handle {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Can't do trim for Null, ARE you mad?");
        }
        System.out.println("End");

        }
}
