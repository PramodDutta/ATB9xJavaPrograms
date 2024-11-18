package Nov.ex_18112024_Exceptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab193_Try_Catch_P2 {
    public static void main(String[] args) {
        // Throws - Checked
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());



            System.out.println("File ni hai1");
        } finally {
            System.out.println("yes");
        }

    }
}
