public class StringUtils {
    // Megakadályozza az osztály példányosítását
    private StringUtils() {
        throw new UnsupportedOperationException("A StringUtils osztály nem példányosítható.");
    }

    public static String removeVowels(String input) {
        // A magánhangzók listája, beleértve az ékezeteseket
        String vowels = "aeiouáéíóöőúüűAEIOUÁÉÍÓÖŐÚÜŰ";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
