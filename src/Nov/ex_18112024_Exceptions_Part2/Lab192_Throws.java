package Nov.ex_18112024_Exceptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab192_Throws {
    public static void main(String[] args) throws FileNotFoundException,Exception {
        // Throws - Checked
        FileInputStream fileInputStream = new FileInputStream("C://a.log");

    }
}
