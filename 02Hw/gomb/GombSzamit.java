import java.util.Scanner;

public class GombSzamit {
    public static void main(String[] args) {
        // Scanner osztály a bemenet olvasásához
        Scanner scanner = new Scanner(System.in);

        // A felhasználótól bekérjük a gömb sugarát
        System.out.print("Kérem, adja meg a gömb sugarát (valós szám): ");
        double sugar = scanner.nextDouble();

        // Létrehozunk egy Gomb objektumot a megadott sugárral
        Gomb gomb = new Gomb(sugar);

        // Kiírjuk a gömb felszínét és térfogatát
        System.out.printf("A gömb felszíne: %.2f négyzetméter\n", gomb.getFelszin());
        System.out.printf("A gömb térfogata: %.2f köbméter\n", gomb.getTerfogat());

        // Scanner lezárása
        scanner.close();
    }
}
