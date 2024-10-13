public class MyMath {
    // Metódus, amely megvizsgálja, hogy a három oldal derékszögű háromszöget alkot-e
    public static boolean isRightTriangle(int a, int b, int c) {
        // A legnagyobb számot c-nek tekintjük
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = 0;

        // Kiszámítjuk a többi oldal négyzetének összegét
        if (max == a) {
            sumOfSquares = b * b + c * c;
        } else if (max == b) {
            sumOfSquares = a * a + c * c;
        } else {
            sumOfSquares = a * a + b * b;
        }

        // Ellenőrizzük, hogy a Pitagorasz-tétel teljesül-e
        return sumOfSquares == max * max;
    }
}
