import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "mozik.csv"; // A fájl neve
        List<String> lines = FileUtils.readLines(fileName); // Fájl beolvasása

        int filmCount = 0; // Számláló a megfelelő filmek számára

        System.out.println("A legalább fél millió szavazattal rendelkező filmek:");
        for (String line : lines) {
            String[] parts = line.split(";"); // A sorok feldarabolása pontosvessző alapján
            if (parts.length == 3) { // Ellenőrizzük, hogy a sor három adatot tartalmaz
                try {
                    String title = parts[1]; // Film címe
                    int votes = Integer.parseInt(parts[2]); // Szavazatok száma

                    if (votes >= 500000) { // Ha a szavazatok száma legalább fél millió
                        System.out.println(title); // Film címe kiírása
                        filmCount++; // Növeljük a számlálót
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Hiba a szavazatok számának beolvasásakor: " + parts[2]);
                }
            } else {
                System.err.println("Hiba: a sor nem tartalmazza a megfelelő számú elemet: " + line);
            }
        }

        // Összesítés
        System.out.println("Összes film, amelyre legalább fél millióan szavaztak: " + filmCount);
    }
}
