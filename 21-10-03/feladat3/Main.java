import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner objektum a felhasználói bemenethez
        System.out.print("Az egyes felhőkarcolók magassága: ");
        String heights = scanner.nextLine(); // A felhasználó által megadott magasságok

        // A SkyScrapers osztály process metódusának meghívása
        int result = SkyScrapers.process(heights);
        // Az eredmény kiírása
        System.out.println("Válasz: " + result);
    }
}
