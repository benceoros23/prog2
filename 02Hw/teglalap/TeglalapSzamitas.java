import java.util.Scanner;

public class TeglalapSzamitas {
    public static void main(String[] args) {
        // Scanner objektum létrehozása a felhasználói bemenethez
        Scanner scanner = new Scanner(System.in);

        // Felhasználó tájékoztatása és az első oldal hosszának bekérése
        System.out.print("Kérem, adja meg a téglalap egyik oldalának hosszát (egész szám): ");
        int oldal1 = scanner.nextInt();

        // Felhasználó tájékoztatása és a másik oldal hosszának bekérése
        System.out.print("Kérem, adja meg a téglalap másik oldalának hosszát (egész szám): ");
        int oldal2 = scanner.nextInt();

        // Teglalap objektum létrehozása és a számítások elvégzése
        Teglalap teglalap = new Teglalap(oldal1, oldal2);

        // Eredmények kiíratása
        System.out.println("A téglalap területe: " + teglalap.getTerulet() + " négyzetegység.");
        System.out.println("A téglalap kerülete: " + teglalap.getKerulet() + " egység.");

        // Scanner bezárása
        scanner.close();
    }
}
