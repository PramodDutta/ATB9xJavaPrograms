package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab066_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        if(age > 18){
            System.out.println("Allowed to vote!");
        }


    }
}
