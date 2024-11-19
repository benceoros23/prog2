import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "day01.txt"; // A fájl neve
        List<Integer> digits = FileUtils.readFirstLineAsDigits(fileName);
        
        // Kiírjuk a beolvasott számjegyeket
        System.out.println("A beolvasott számjegyek: " + digits);
        
        // Kiszámítjuk a számjegyek összegét
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        
        // Kiírjuk az összeget
        System.out.println("A számjegyek összege: " + sum);
    }
}