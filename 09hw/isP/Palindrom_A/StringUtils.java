public class StringUtils{

    public static boolean isPalindrome(String szo) {
        int hossz = szo.length();
        for (int i = 0; i < hossz / 2; i++) {
            if (szo.charAt(i) != szo.charAt(hossz - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}