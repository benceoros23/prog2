public class Teglalap {
    private int oldal1;
    private int oldal2;

    // Konstruktor
    public Teglalap(int oldal1, int oldal2) {
        this.oldal1 = oldal1;
        this.oldal2 = oldal2;
    }

    // Terület kiszámítása
    public int getTerulet() {
        return oldal1 * oldal2;
    }

    // Kerület kiszámítása
    public int getKerulet() {
        return 2 * (oldal1 + oldal2);
    }
}
