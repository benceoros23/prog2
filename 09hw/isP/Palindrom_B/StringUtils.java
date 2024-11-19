public class StringUtils {

    public static boolean isPalindrome(String str) {
        // A sztringet kisbetűsre alakítjuk, hogy a nagybetűk ne befolyásolják az ellenőrzést
        String normalizedStr = str.toLowerCase();
        // A visszafelé olvasott sztring
        String reversedStr = new StringBuilder(normalizedStr).reverse().toString();
        // Ellenőrizzük, hogy a két sztring megegyezik-e
        return normalizedStr.equals(reversedStr);
    }
}