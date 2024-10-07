import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);
        
        // Megoldás 1: Tömb használata
        int[] minMaxArray = minMaxArray(szamok);
        System.out.println("Tömb: Min: " + minMaxArray[0] + ", Max: " + minMaxArray[1]);

        // Megoldás 2: Lista használata
        List<Integer> minMaxList = minMaxList(szamok);
        System.out.println("Lista: Min: " + minMaxList.get(0) + ", Max: " + minMaxList.get(1));

        // Megoldás 3: Saját objektum használata
        MinMax minMaxObject = minMaxObject(szamok);
        System.out.println("Objektum: Min: " + minMaxObject.getMin() + ", Max: " + minMaxObject.getMax());
    }

    // 1. Megoldás: Tömb visszaadása
    public static int[] minMaxArray(List<Integer> szamok) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int szam : szamok) {
            if (szam < min) {
                min = szam;
            }
            if (szam > max) {
                max = szam;
            }
        }

        return new int[]{min, max};
    }

    // 2. Megoldás: Lista visszaadása
    public static List<Integer> minMaxList(List<Integer> szamok) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int szam : szamok) {
            if (szam < min) {
                min = szam;
            }
            if (szam > max) {
                max = szam;
            }
        }

        return List.of(min, max);
    }

    // 3. Megoldás: Saját objektum visszaadása
    public static MinMax minMaxObject(List<Integer> szamok) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int szam : szamok) {
            if (szam < min) {
                min = szam;
            }
            if (szam > max) {
                max = szam;
            }
        }

        return new MinMax(min, max);
    }
}

// Saját objektum osztály
class MinMax {
    private final int min;
    private final int max;

    public MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
