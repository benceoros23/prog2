import java.util.Scanner;

public class Negyzet {
    private int oldal;

    public Negyzet(int oldal) {
        this.oldal = oldal;
    }

    public int kerulet() {
        return 4 * oldal;
    }

    public int terulet() {
        return oldal * oldal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a négyzet oldalának a hosszát: ");
        int oldal = scanner.nextInt();

        Negyzet negyzet = new Negyzet(oldal);

        System.out.println("A négyzet kerülete: " + negyzet.kerulet());
        System.out.println("A négyzet területe: " + negyzet.terulet());
    }
}