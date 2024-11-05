public class Main {
    public static void main(String[] args) {
        String input = PyUtils.input("Text: ");
        String randomCaseText = StringUtils.randomCase(input);
        System.out.println(randomCaseText);
    }
}
