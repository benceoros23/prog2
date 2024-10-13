import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Adjon meg egy szöveget: ");
        String input = scanner.nextLine();
        
        // Ellenőrizzük, hogy mindkét szó előfordul-e
        boolean hasBad = input.contains("bad");
        boolean hasGood = input.contains("good");

        if (hasBad && hasGood) {
            // Cseréljük ki a szavakat
            input=input.replaceAll("good", "bad").replaceAll("bad", "good");
        }

        System.out.println("Kimenet: " + input);
        
        scanner.close();
    }
}
