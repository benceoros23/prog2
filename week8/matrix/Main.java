import java.util.Arrays
;

public class Main 
{
    public static void main(String[] args) {
        int [][] matrix=new int[3][2];
        matrix [0][0]=3;
        matrix [0][1]=2;
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));
        int[][] matrix2={{3,2},{8,1},{7,3}};
        System.out.println(Arrays.deepToString(matrix2));

    }
}