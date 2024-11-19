import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("RandInt példák:");
        System.out.println(RandUtils.randint(1, 10)); // Pl. 1 és 10 között

        System.out.println("RandRange példák:");
        System.out.println(RandUtils.randrange(1, 10)); // Pl. 1 és 10 között (10 nélkül)

        System.out.println("Choice példák:");
        System.out.println(RandUtils.choice(List.of(1, 2, 3, 4, 5, 6))); // Véletlen elem a listából
        
    }

    // Belső statikus osztály
    public static class RandUtils {
        private static final Random random = new Random();

        // randint(min, max): Véletlenszámot generál min és max között (mindkettőt beleértve)
        public static int randint(int min, int max) {
            if (min > max) {
                System.out.println("Hiba: A minimum nem lehet nagyobb, mint a maximum.");
                return -1; // Alapértelmezett hibás érték
            }
            return random.nextInt((max - min) + 1) + min;
        }

        // randrange(start, stop): Véletlenszámot generál a [start, stop) tartományban
        public static int randrange(int start, int stop) {
            if (start >= stop) {
                System.out.println("Hiba: A kezdő érték nem lehet nagyobb vagy egyenlő a záró értékkel.");
                return -1; // Alapértelmezett hibás érték
            }
            return random.nextInt(stop - start) + start;
        }

        // choice(list): Véletlen elemet választ egy listából
        public static <T> T choice(List<T> list) {
            if (list == null || list.isEmpty()) {
                System.out.println("Hiba: A lista nem lehet üres vagy null.");
                return null; // Alapértelmezett hibás érték
            }
            return list.get(randint(0, list.size() - 1));
        }
    }
}
