import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 1, 4, 1, 5};
        int[] array2 = {3, 1, 4, 1, 5};
        
        // Összehasonlítás
        System.out.println(MyArrayUtils.equals(array1, array2)); // true
        
        // Feltöltés
        MyArrayUtils.fill(array1, 0);
        System.out.println(MyArrayUtils.equals(array1, new int[]{0, 0, 0, 0, 0})); // true
        
        // Rendezés
        MyArrayUtils.sort(array2);
        System.out.println(Arrays.toString(array2)); // [1, 1, 3, 4, 5]
    }
}
