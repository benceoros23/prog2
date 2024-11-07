public class Main
{
    public static void main(String[] args) {
        if(args.length!=1)
        {
            System.out.println("Hibás formátum! Kérjük, adjon meg egy négy négyjegyű számból álló kódot, kötőjellel elválasztva (pl. 1234-5678-9012-3456).");
            System.exit(1);
        }
        String code=args[0];
        String[] parts = code.split("-");
        if(parts.length!=4)
        {
            System.out.println("Hibás formátum! Kérjük, adjon meg egy négy négyjegyű számból álló kódot, kötőjellel elválasztva (pl. 1234-5678-9012-3456).");
            System.exit(1);
        }
        int sum=0;
        for(String part:parts)
        {
            if (part.length() != 4) {
                System.out.println("Hibás formátum! Kérjük, adjon meg egy négy négyjegyű számból álló kódot, kötőjellel elválasztva (pl. 1234-5678-9012-3456).");
                System.exit(1);
            }
            int lastDigit = Character.getNumericValue(part.charAt(3));
            sum += lastDigit;


        }
        if (sum % 5 == 0) {
            System.out.println("Érvényes kód");
        } else {
            System.out.println("Érvénytelen kód");
        }
    }
}