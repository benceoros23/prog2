import java.util.Arrays;

public class MyArrayUtils {
    public static void sortDescending(int[] tomb) {
        // A tömb növekvő sorrendbe rendezése
        Arrays.sort(tomb);
        // A tömb elemeinek visszafordítása
        for (int i = 0; i < tomb.length / 2; i++) {
            int temp = tomb[i];
            tomb[i] = tomb[tomb.length - 1 - i];
            tomb[tomb.length - 1 - i] = temp;
        }
    }
}
