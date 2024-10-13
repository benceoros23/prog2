public class Main {
    public static void main(String[] args) {
        // Ellenőrizzük, hogy pontosan egy paramétert adtak-e meg
        if (args.length != 1) {
            System.out.println("Hiba! Adj meg pontosan egy szót!");
            System.exit(1); // 1-es hibakód
        }

        String word = args[0];
        int result = Hash.stringHash(word); // Hash érték kiszámítása
        System.out.println(result); // Hash érték kiírása
    }
}
