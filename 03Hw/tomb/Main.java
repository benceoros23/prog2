import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tomb = {2, 5, 1, 4, 3};
        
        System.out.println(Arrays.toString(tomb)); // [2, 5, 1, 4, 3]
        
        MyArrayUtils.sortDescending(tomb);
        
        System.out.println(Arrays.toString(tomb)); // [5, 4, 3, 2, 1]
    }
}
