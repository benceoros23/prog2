public class Tisztit {
    public static String removeWhitespace(String input) {
        // A \\s reguláris kifejezés a whitespace karakterekre illeszkedik
        return input.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String proxyAddress = "192.20.246.138:\n 6666";
        String cleanedProxy = removeWhitespace(proxyAddress);
        System.out.println(cleanedProxy); // "192.20.246.138:6666"
    }
}