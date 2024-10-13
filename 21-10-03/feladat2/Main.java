public class Main {
    public static void main(String[] args) {
        // Ellenőrizzük, hogy legalább egy szó és egy betű megadásra került-e
        if (args.length < 2) {
            System.out.println("Hiba! Adj meg egy szót és legalább egy darab betűt!");
            System.exit(1);
        }

        String szo = args[0];
        String betuk = String.join("", args).substring(szo.length()); // Összefűzzük a betűket

        String eredmeny = ""; // Az eredmény tárolására

        // Végigmegyünk a szón, és ha a karakter szerepel a megadott betűk között, duplázzuk
        for (char c : szo.toCharArray()) {
            eredmeny += c; // Hozzáadjuk az aktuális karaktert
            if (betuk.contains(String.valueOf(c))) {
                eredmeny += c; // Ha a betű benne van a megadott betűkben, duplázzuk
            }
        }

        // Az eredmény kiírása
        System.out.println(eredmeny);
    }
}
