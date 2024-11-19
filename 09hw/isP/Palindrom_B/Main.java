import java.util.List;

public class Main {

    public static void main(String[] args) {
        // A fájl neve
        String fileName = "words_alpha.txt";
        // A szavak beolvasása a fájlból
        List<String> words = FileUtils.readLines(fileName);
        int palindromeCount = 0;

        // Minden szó ellenőrzése
        for (String word : words) {
            if (StringUtils.isPalindrome(word)) {
                palindromeCount++;
            }
        }

        // Az eredmény kiírása
        System.out.println("A palindróm szavak száma: " + palindromeCount);
    }
}