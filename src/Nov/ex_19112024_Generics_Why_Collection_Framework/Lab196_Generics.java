package Nov.ex_19112024_Generics_Why_Collection_Framework;

public class Lab196_Generics {
    public static void main(String[] args) {

        temp_sum(23,45);
        temp_sum("Pramod","Dutta");


    }

    public static Integer temp_sum(Integer a, Integer b){
        return  a+b;
    }

    public static String temp_sum(String a, String b){
        return  a+b;
    }
}
