package Nov.ex_15112024_Wrapper_Exceptions_Part2;

public class Lab174_Exception_Example {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000 / a;
        System.out.println(b);

        System.out.println("End of program");


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM


    }
}
