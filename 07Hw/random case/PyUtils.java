import java.util.Scanner;

public class PyUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
