public class Main4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hibás formátum! Kérjük, adjon meg egy számsort kötőjellel és aláhúzással elválasztva (pl. 12-34_56-78).");
            System.exit(1);
        }

        String[] sections = args[0].split("_");
        for (String section : sections) {
            String[] numbers = section.split("-");
            int sum = 0;
            for (String number : numbers) {
                for (char digit : number.toCharArray()) {
                    sum += Character.getNumericValue(digit);
                }
            }
            if (sum % 2 != 0) {
                System.out.println("Nem megfelelő szakasz található");
                System.exit(1);
            }
        }
        System.out.println("Minden szakasz megfelelő");
    }
}
