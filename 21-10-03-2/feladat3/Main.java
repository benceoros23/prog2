import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        String cleaned = StringUtils.removeVowels(input);
        
        System.out.println("Output: " + cleaned);
        
    }
}
