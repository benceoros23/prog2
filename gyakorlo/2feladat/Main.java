public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Hiba! Adj meg egy sztringet!");
            System.exit(1);
        } else {
            String input = args[0];
            String modifiedString = StringUtils.swapCase(input);
            System.out.println(modifiedString);
        }
    }
}

class StringUtils {

    // Ez a függvény végzi a kis- és nagybetűk cseréjét az angol ábécében
    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                swapped.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                swapped.append(Character.toUpperCase(ch));
            } else {
                swapped.append(ch);  // nem ábécés karakterek esetén hagyja változatlanul
            }
        }

        return swapped.toString();
    }
}
