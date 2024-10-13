// A Hash osztály, amely kiszámítja a string hash értékét
public class Hash {
    // A konstans, amellyel a hash értéket modulózzuk
    private static final int MODULUS = 103;

    // A metódus, ami kiszámítja a szó hash értékét
    public static int stringHash(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            // Betű ASCII kódja * pozíció
            sum += str.charAt(i) * (i + 1);
        }

        return sum % MODULUS; // Hash érték modulózása
    }

   
    
}
