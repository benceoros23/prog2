import java.util.ArrayList;
import java.util.List;

public class PyUtils {
    // range metódus háromféle változatban túlterhelve
    
    // Két paraméteres változat (start, end)
    public static List<Integer> range(int start, int end) {
        return range(start, end, 1);
    }
    
    // Egy paraméteres változat (end)
    public static List<Integer> range(int end) {
        return range(0, end, 1);
    }
    
    // Három paraméteres változat (start, end, step)
    public static List<Integer> range(int start, int end, int step) {
        List<Integer> result = new ArrayList<>();
        
        if (step <= 0) {
            throw new IllegalArgumentException("Step must be a positive value.");
        }

        for (int i = start; i < end; i += step) {
            result.add(i);
        }
        
        return result;
    }

    // Tesztelés
    public static void main(String[] args) {
        System.out.println(PyUtils.range(0, 5)); // [0, 1, 2, 3, 4]
        System.out.println(PyUtils.range(3, 7)); // [3, 4, 5, 6]
        System.out.println(PyUtils.range(3, 4)); // [3]
        System.out.println(PyUtils.range(3, 3)); // []
        System.out.println(PyUtils.range(10));   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(PyUtils.range(1));    // [0]
        System.out.println(PyUtils.range(0));    // []
        System.out.println(PyUtils.range(-4));   // []
        System.out.println(PyUtils.range(4, 20, 2)); // [4, 6, 8, 10, 12, 14, 16, 18]
        System.out.println(PyUtils.range(4, 10, 1)); // [4, 5, 6, 7, 8, 9]
        System.out.println(PyUtils.range(10, 4, 1)); // []
    }
    
}
