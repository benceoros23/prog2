public class HammingDistance {

    public static int calculateHammingDistance(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return -1;
        }

        int distance = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        String str1 = "toned";
        String str2 = "roses";

        int hammingDistance = calculateHammingDistance(str1, str2);
        if (hammingDistance == -1) {
            System.out.println("A két sztringnek azonos hosszúságúnak kell lennie.");
        } else {
            System.out.println("A Hamming-távolság: " + hammingDistance);
        }
    }
}
