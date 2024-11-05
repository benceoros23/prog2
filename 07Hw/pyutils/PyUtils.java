import java.util.Scanner;

public class PyUtils {
    private static final Scanner scanner = new Scanner(System.in);

    // Version with a prompt
    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Version without a prompt
    public static String input() {
        return scanner.nextLine();
    }
}
