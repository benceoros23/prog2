public class MyArrayUtils {

    // Metódus két tömb összehasonlítására
    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return array1 == array2; // Mindkettő null vagy nem
        }
        if (array1.length != array2.length) {
            return false; // Hosszok eltérnek
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Elemek eltérnek
            }
        }
        return true; // Az összes elem megegyezik
    }

    // Metódus tömb feltöltésére egy adott értékkel
    public static void fill(int[] array, int value) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = value; // Minden elemet értékre állítunk
            }
        }
    }

    // Metódus tömb rendezésére (buborékos rendezés)
    public static void sort(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Elek cseréje
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}
