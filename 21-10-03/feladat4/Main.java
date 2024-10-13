import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Kérlek, add meg a fájl nevét.");
            System.exit(1);
        }

        String fileName = args[0];
        List<String> lines = FileUtils.readLines(fileName); // A sorok beolvasása a fájlból
        int checksum = calculateChecksum(lines); // Az ellenőrző összeg kiszámítása
        System.out.println(checksum); // Az eredmény kiírása
    }

    // Metódus, ami kiszámítja az ellenőrző összeget
    private static int calculateChecksum(List<String> lines) {
        int checksum = 0;

        for (String line : lines) {
            String[] numbers = line.trim().split("\\s+"); // Számok leválasztása
            if (numbers.length > 0) {
                int first = Integer.parseInt(numbers[0]); // Az első szám
                int last = Integer.parseInt(numbers[numbers.length - 1]); // Az utolsó szám
                checksum += first % last; // (a mod b) hozzáadása az összeghez
            }
        }
        
        return checksum; // Az ellenőrző összeg visszaadása
    }
}
