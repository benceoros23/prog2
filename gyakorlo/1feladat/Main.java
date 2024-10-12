import java.util.List;

public class Main {

    // Ellenőrzi, hogy egy jelszó erős-e vagy sem
    public static boolean isStrongPassword(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        int digitCount = 0;
        boolean hasSpecialChar = false;

        // Speciális karakterek definiálása
        String specialChars = ".:,;";

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (specialChars.indexOf(c) >= 0) {
                hasSpecialChar = true;
            }
        }

        // A jelszó akkor erős, ha minden feltétel teljesül
        return hasLower && hasUpper && digitCount >= 2 && hasSpecialChar;
    }

    public static void main(String[] args) {
        // A passwords.txt fájl beolvasása a FileUtils segítségével
        List<String> passwords = FileUtils.readLines("passwords.txt");

        // Erős jelszavak számlálója
        int strongPasswordCount = 0;

        // Jelszavak ellenőrzése
        for (String password : passwords) {
            if (isStrongPassword(password)) {
                strongPasswordCount++;
            }
        }

        // Az erős jelszavak számának kiírása
        System.out.println("Erős jelszavak száma: " + strongPasswordCount);
    }
}
