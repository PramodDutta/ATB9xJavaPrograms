package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab129_Arrays_Max_Value_InterviewQ_Easy {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);


    }

}
