import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy mondatot: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Hiba! Egy mondatot kell megadni!");
            System.exit(1);

        }
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
        System.out.println("Fordított sorrend: " + reversedSentence.toString().toLowerCase());
    
    }
}