package Oct.ex_15102024_Ternary;

public class Lab062 {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        //If the score is 90 or above, the grade will be "A".
        //If the score is between 80 and 89, the grade will be "B".
        //If the score is between 70 and 79, the grade will be "C".
        //If the score is between 60 and 69, the grade will be "D".
        //If the score is below 60, the grade will be "F".

        int score = 90;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Your Grade is -> " + grade);
        System.out.printf("Your Grade is %s", grade);


    }
}
