public class StringDigitSum {

    public static int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            // Ha a karakter számjegy, hozzáadjuk az értékét a sum változóhoz
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "90146852";
        System.out.println("A számjegyek összege: " + sumOfDigits(s));
    }
}
