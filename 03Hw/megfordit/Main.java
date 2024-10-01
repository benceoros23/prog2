import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] szamok = {45, 65, 44, 75, 74, 54, 655};

        System.out.println("Eredeti tömb: " + Arrays.toString(szamok));

        MyArrayUtils.reverse(szamok);
        System.out.println("Megfordított tömb: " + Arrays.toString(szamok));
    }
}

class MyArrayUtils {
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Cseréljük meg az elemeket
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
