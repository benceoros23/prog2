import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Ellenőrizzük, hogy pontosan 1 paramétert adtak-e meg
        if (args.length != 1) {
            System.out.println("Hiba! Paraméternek egy nevet adjon meg!");
            System.exit(1); // Hibakóddal lépünk ki
        }

        String keresettNev = args[0];
        List<String> sorok = FileUtils.readLines("nevek.txt");
        int szamlalo = 0;

        // Végigmegyünk minden soron, és megszámoljuk, hogy a keresett név hányszor fordul elő
        for (String sor : sorok) {
            String[] nevek = sor.split(" ");
            for (String nev : nevek) {
                if (nev.equals(keresettNev)) {
                    szamlalo++;
                }
            }
        }

        // Kiírjuk a név előfordulásának számát
        System.out.println(szamlalo);
    }
}
