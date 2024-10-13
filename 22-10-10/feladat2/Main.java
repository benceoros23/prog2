import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Felhasználótól bekérjük a szöveget
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy szöveget: ");
        String input = scanner.nextLine();

        // Az ismétlődések eltávolítása
        String result = MyStringUtils.removeLetterRepetition(input);
        System.out.println("Kimenet: " + result);
    }
}

class MyStringUtils {
    public static String removeLetterRepetition(String input) {
        // Tömb az összes betű számára (a-z, A-Z)
        boolean[] seen = new boolean[256]; // ASCII karakterkészlet

        StringBuilder result = new StringBuilder();

        // Sztring végigjárása karakterenként
        for (char c : input.toCharArray()) {
            // Ha nem szóköz és még nem láttuk ezt a karaktert
            if (c != ' ' && !seen[Character.toLowerCase(c)]) {
                result.append(c);
                seen[Character.toLowerCase(c)] = true; // A karaktert megjelöljük látottként
            } else if (c == ' ') {
                // Szóközöket megtartjuk
                result.append(c);
            }
        }

        return result.toString();
    }
}
