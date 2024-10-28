package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab124_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Sharma");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(sb.toString()); // Output: Hello World!

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);


    }
}
