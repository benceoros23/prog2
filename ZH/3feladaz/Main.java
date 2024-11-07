public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba! Kérem adjon meg egy sárkány csigolyáit reprezentáló számsort (pl. 534_812_911_638) parancssori argumentumként.");
            return;
        }

        String input = args[0];
        String[] vertebrae = input.split("_");

        for (int i = 0; i < vertebrae.length; i++) {
            String vertebra = vertebrae[i];
            int sum = Character.getNumericValue(vertebra.charAt(0)) +
                      Character.getNumericValue(vertebra.charAt(1)) +
                      Character.getNumericValue(vertebra.charAt(2));
            
            if (sum >= 15) {
                System.out.println("Az első csigolya, ahol a sárkány sebezhető: " + (i + 1));
                return;
            }
        }

        System.out.println("A sárkány sebezhetetlen!");
    }
}
