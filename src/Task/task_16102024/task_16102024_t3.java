package Task.task_16102024;

public class task_16102024_t3 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // Exp1-> --a ->  19 , a = 19
        // Exp2-> a++ ->  19, a = 20
        // Exp3-> a-- ->  20, a -> 19

//        In exp 2 should it not be 20 instead of 19 . I have a doubt
//        A - --a    19    19
//        B - a++    19    20
//        C - a--    20    19


    }
}
