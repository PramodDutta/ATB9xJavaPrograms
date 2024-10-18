package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab076_Switch {
    public static void main(String[] args) {
        // Switch Condition
        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }

        System.out.println("End of the Loop");
        sc.close();

    }
}
