public class Main3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hibás formátum! Kérjük, adjon meg egy vesszővel elválasztott súlylistát (pl. 12,15,18,09,20).");
            System.exit(1);
        }
        String adat=args[0];
        String[] adatok=adat.split(",");
        int count=0;
        for (String valami : adatok) {
            int w=Integer.parseInt(valami);
            if(w>=10 && w<=20)
            {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Megfelelő ásványok száma: " + count);
        } else {
            System.out.println("Nincs megfelelő ásvány");
        }
    }
}
