package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
    }
}
