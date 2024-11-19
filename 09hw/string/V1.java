import java.util.List;

public class V1 {
    public static void main(String[] args) {
        // Config fájl beolvasása
        List<String> lines = FileUtils.readLines("config.txt");
        String configValue = lines.get(0).replace("_", ""); // "_" eltávolítása
        int N = Integer.parseInt(configValue); // Átalakítás számra

        // Eredmény előállítása String konkatenációval
        String result = "";
        for (int i = 1; i <= N; i++) {
            result += i;
        }

        // Csak az eredmény hossza kerül kiírásra
        System.out.println("Eredmény hossza: " + result.length());
    }
}
