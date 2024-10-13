public class Main {
    public static void main(String[] args) {
        // Ellenőrizzük, hogy a felhasználó pontosan 3 számot adott-e meg
        if (args.length != 3) {
            System.out.println("Hiba! Paraméterként 3 számot adjon meg!");
            System.exit(1); // Kilépés hibakóddal
        }

        // Parancssori argumentumok átkonvertálása
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Ellenőrizzük, hogy derékszögű-e a háromszög
        if (MyMath.isRightTriangle(a, b, c)) {
            System.out.println("A háromszög derékszögű!");
        } else {
            System.out.println("A háromszög nem derékszögű!");
        }
    }
}
