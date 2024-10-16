package Task.task_16102024;

public class task_16102024_t1 {
    public static void main(String[] args) {

        // Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        // condition ? value_if_true : value_if_false;

        int a = -5;
        int b = 20;
        int c = -10;

        // In future we will ask the user for these values
        // we will take a user input

        // Rough Logic
        // a >=b && a >=c -> a : b >=c -> b : c

        int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Max Number is -> " +  result);

        // (a>b)?(a>c?a:c):(b>c?b:c)
        // (a>b && a>c) ? a : (b>a && b>c) ? b: c; it is correct or not?








    }
}
