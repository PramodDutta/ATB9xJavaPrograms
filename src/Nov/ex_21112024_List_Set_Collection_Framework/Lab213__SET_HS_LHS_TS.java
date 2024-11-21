package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab213__SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet();
        // Hashing mechanism to store the element,
        // no order. no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);



        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet();
//        Set<String> ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(null); // Null Pointer
        //ts.add(123); // java.lang.ClassCastException
        System.out.println(ts);


        for(Object o:ts){
            System.out.println(o);
        }












    }
}
