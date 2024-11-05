public class StringUtils {

    public static String randomCase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Math.random() < 0.5 esetén kisbetű, különben nagybetű
                if (Math.random() < 0.5) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            } else {
                result.append(c); // Nem betűkaraktereket változatlanul hagyjuk
            }
        }
        
        return result.toString();
    }
}

