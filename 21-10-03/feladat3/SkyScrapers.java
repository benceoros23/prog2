public final class SkyScrapers {

    
   

    // Statikus metódus, ami kiszámítja a szomszédos felhőkarcolók magasságkülönbségeinek összegét
    public static int process(String heights) {
        int sum = 0; // Az összeg tárolására szolgáló változó
        for (int i = 0; i < heights.length() - 1; i++) {
            // A jelenlegi és a következő magasság lekérdezése
            int currentHeight = Character.getNumericValue(heights.charAt(i));
            int nextHeight = Character.getNumericValue(heights.charAt(i + 1));
            // A magasságkülönbség abszolút értékének hozzáadása az összeghez
            sum += Math.abs(currentHeight - nextHeight);
        }
        return sum; // Az összeg visszaadása
    }
}
