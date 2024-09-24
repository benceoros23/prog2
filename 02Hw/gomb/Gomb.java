// Gomb.java - Külön osztály a felszín és térfogat számításhoz
public class Gomb {
    private double sugar;

    // Konstruktor, amely beállítja a gömb sugarát
    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    // Metódus a gömb felszínének kiszámítására
    public double getFelszin() {
        return 4 * Math.PI * Math.pow(sugar, 2);
    }

    // Metódus a gömb térfogatának kiszámítására
    public double getTerfogat() {
        return (4.0 / 3) * Math.PI * Math.pow(sugar, 3);
    }
}
