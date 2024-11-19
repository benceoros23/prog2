public class TisztitTest {
    public static void main(String[] args) {
        tesztTisztit();
    }

    public static void tesztTisztit() {
        String input = "192.20.246.138:\n 6666";
        String expectedOutput = "192.20.246.138:6666";
        String cleanedInput = Tisztit.removeWhitespace(input);
        assert cleanedInput.equals(expectedOutput) : "Rosssz";
        System.out.println("SIKERES");
    }
}