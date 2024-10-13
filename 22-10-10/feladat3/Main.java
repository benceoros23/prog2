public class Main {
    public static void main(String[] args) {
        // Ellenőrizzük, hogy a felhasználó pontosan 2 paramétert adott-e meg
        if (args.length != 2) {
            System.err.println("Hiba! Adjon meg két számot paraméterben!");
            System.exit(1);
        }

        try {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);

            // Ellenőrizzük, hogy a második szám nagyobb-e, mint az első
            if (second <= first) {
                System.err.println("Hiba! A második megadott szám nagyobb legyen mint az első!");
                System.exit(1);
            }

            long sum = 0;

            // Számok hatványainak összegzése
            for (int i = first; i <= second; i++) {
                sum += Math.pow(i, i);  // i saját magára emelt hatványa
            }

            System.out.println(sum);

        } catch (NumberFormatException e) {
            System.err.println("Hiba! A megadott paraméterek nem érvényes számok!");
            System.exit(1);
        }
    }
}
