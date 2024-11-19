import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("A fájl nem található: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Hiba a fájl beolvasása közben: " + e.getMessage());
        }
        return lines;
    }

    // Új metódus: beolvassa az első sort és visszaadja a számjegyeket List<Integer> formájában
    public static List<Integer> readFirstLineAsDigits(String fileName) {
        List<Integer> digits = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // Beolvassuk az első sort
            if (line != null) {
                for (char c : line.toCharArray()) {
                    // Ellenőrizzük, hogy a karakter számjegy-e
                    if (Character.isDigit(c)) {
                        digits.add(Character.getNumericValue(c)); // Átkonvertáljuk Integer-re
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("A fájl nem található: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Hiba a fájl beolvasása közben: " + e.getMessage());
        }
        return digits;
    }
}