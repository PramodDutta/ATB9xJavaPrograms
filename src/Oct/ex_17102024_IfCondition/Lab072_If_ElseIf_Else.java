package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab072_If_ElseIf_Else {
    public static void main(String[] args) {
        // Condition - 2 outputs ,
        // Can we have two or more outputs?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        //  1 ->  num1 >  num 2
        // 2 -> num2 > num1
        // 3 -> num1==num2
        if (num1 > num2) {
            System.out.println("Num 1 > Num2 ");
        } else if (num2 > num1) {
            System.out.println("Num 2 > Num1 ");
        } else {
            System.out.println("Equal");
        }
        //=-> assigment
        // == -> comparsion


    }
}
