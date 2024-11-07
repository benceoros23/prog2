import java.util.Scanner;

public class Main3 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy mondatot: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Hiba! Egy mondatot kell megadni!");
            return;
        }
        
        int vowelCount = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Magánhangzók száma: " + vowelCount);
    }

}
