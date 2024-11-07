import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy mondatot: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Hiba! Egy mondatot kell megadni!");
            return;
        }
        
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 1) {
                // Swap first and last characters
                String modifiedWord = word.charAt(word.length() - 1) 
                                      + word.substring(1, word.length() - 1) 
                                      + word.charAt(0);
                result.append(modifiedWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        
        System.out.println("Kimenet: " + result.toString().trim());
    }
}
