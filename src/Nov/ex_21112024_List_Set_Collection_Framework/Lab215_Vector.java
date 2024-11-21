package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab215_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        for (String o: vector){
            System.out.println(o);
        }

        // Iterator? - For legacy Class I can't use
        // Enumeration

        System.out.println(" --- ");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }



    }
}
