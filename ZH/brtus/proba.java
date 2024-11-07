import java.util.ArrayList;
import java.util.Scanner;

public class proba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bekérjük a mondatot a felhasználótól
        System.out.println("Kérem adjon meg egy mondatot:");
        String sentence = scanner.nextLine();

        // Feldaraboljuk a mondatot szavakra
        String[] words = sentence.split("\\s+");

        // Listák a magánhangzóval és mássalhangzóval kezdődő szavaknak
        ArrayList<String> vowelWords = new ArrayList<>();
        ArrayList<String> consonantWords = new ArrayList<>();

        // Magánhangzók halmaza az angol ábécé alapján
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        // Megvizsgáljuk minden szó első karakterét
        for (String word : words) {
            if (word.length() > 0) {
                boolean isVowel = false;
                for (String vowel : vowels) {
                    if (word.startsWith(vowel)) {
                        vowelWords.add(word);
                        isVowel = true;
                        break; // Kilépünk a ciklusból, ha találtunk egy magánhangzót
                    }
                }
                if (!isVowel) {
                    consonantWords.add(word);
                }
            }
        }

        // Kiírjuk a magánhangzóval kezdődő szavakat egy sorban
        System.out.print("Magánhangzóval kezdődő szavak: ");
        for (String word : vowelWords) {
            System.out.print(word + " , ");
        }
        System.out.println(); // Új sort kezdünk a mássalhangzóval kezdődő szavak előtt

        // Kiírjuk a mássalhangzóval kezdődő szavakat egy sorban
        System.out.print("Mássalhangzóval kezdődő szavak: ");
        for (String word : consonantWords) {
            System.out.print(word + " , ");
        }
        System.out.println(); // Új sort kezdünk a program végén
    }
}
