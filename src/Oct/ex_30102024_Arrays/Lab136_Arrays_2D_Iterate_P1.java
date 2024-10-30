package Oct.ex_30102024_Arrays;


public class Lab136_Arrays_2D_Iterate_P1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
