import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérlek, adj meg egy páratlan számot: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i += 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
