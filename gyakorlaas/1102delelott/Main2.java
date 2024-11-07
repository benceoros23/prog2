public class Main2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hibás bemenet! Kérjük, adjon meg egy kötőjellel elválasztott fordulatszám listát (pl. 10-15-20-25-30).");
            System.exit(1);
        }

        String szamok=args[0];
        
        String[] szam=szamok.split("-");
        
        for (int i = 0; i < szam.length; i++) {
            int speed=Integer.parseInt(szam[i]);
            if(speed>=25)
            {
                System.out.println("Az első kritikus fordulatszám pozíciója: " +(i + 1));
                System.exit(1);

            }
        }
        System.out.println("A turbina biztonságos üzemmódban működik");

    }
}
