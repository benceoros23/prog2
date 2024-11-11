import java.util.List;

public class Avc {

    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("day01.txt");

        if (lines.isEmpty()) {
            System.out.println("A fájl üres.");
            return;
        }

        String input = lines.get(0).trim(); 
        int sum = calculateCircularSum(input);
        System.out.println("Az azonos számjegyek összegének eredménye: " + sum);
    }

    public static int calculateCircularSum(String digits) {
        int sum = 0;
        int length = digits.length();

        for (int i = 0; i < length; i++) {
            char currentDigit = digits.charAt(i);
            char nextDigit = digits.charAt((i + 1) % length); 

            if (currentDigit == nextDigit) {
                sum += Character.getNumericValue(currentDigit);
            }
        }

        return sum;
    }
}

