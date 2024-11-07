import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy mondatot: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Hiba! Egy mondatot kell megadni!");
            return;
        }
        
        String[] words = input.split("\\s+");

        // Sort the array based on word length without using Comparator
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    // Swap words[i] and words[j]
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.println("Rendezett szavak hossz szerint: " + String.join(" ", words));
    }
}
