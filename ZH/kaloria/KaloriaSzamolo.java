import java.util.List;

public class KaloriaSzamolo {
    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("adatok.txt"); // Beolvassuk a fájl sorait
        int maxKaloria = 0;
        int jelenlegiKaloria = 0;

        for (String line : lines) {
            if (line.isEmpty()) {
                // Ha üres sort találunk, akkor befejeződik egy túrázó adata
                if (jelenlegiKaloria > maxKaloria) {
                    maxKaloria = jelenlegiKaloria;
                }
                jelenlegiKaloria = 0; // Új túrázó adatai jönnek
            } else {
                // Ha nem üres sor, hozzáadjuk a kalória értékhez
                jelenlegiKaloria += Integer.parseInt(line);
            }
        }

        // Az utolsó túrázó adatainak ellenőrzése (ha nem üres sorral végződik a fájl)
        if (jelenlegiKaloria > maxKaloria) {
            maxKaloria = jelenlegiKaloria;
        }

        System.out.println("A legtöbb elégetett kalória: " + maxKaloria);
    }
}
