public class SwapCase {

    public static String swapCase(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Számok és egyéb karakterek maradnak változatlanul
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Hello2023World";
        System.out.println("Eredmény: " + swapCase(text));
    }
}
