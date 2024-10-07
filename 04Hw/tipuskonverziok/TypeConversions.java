public class TypeConversions {
    public static void main(String[] args) {
        // Converting "123" to long
        long y = Long.parseLong("123");
        System.out.println("y's value: " + y);

        // Converting "3.14" to float
        float z = Float.parseFloat("3.14");
        System.out.println("z's value: " + z);

        // Converting "7.89" to double
        double w = Double.parseDouble("7.89");
        System.out.println("w's value: " + w);

        // Converting "a" to char
        char c = "a".charAt(0);
        System.out.println("c's value: " + c);
    }
}