package Nov.ex_19112024_Generics_Why_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_ArrayList {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1)); // Int check
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list












    }
}
