public class MathDemonstracio {
    public static void main(String[] args) {
        // Abszolút érték számítása
        System.out.println("Abszolút érték számítása:");
        System.out.println("Az abszolút értéke a -5-nek: " + Math.abs(-5));
        System.out.println("Az abszolút értéke a 3-nak: " + Math.abs(3));
        System.out.println("-------------------------");

        // Hatványozás
        System.out.println("Hatványozás:");
        System.out.println("A 2 hatványozva 3-mal: " + Math.pow(2, 3));
        System.out.println("A 4 hatványozva 2-vel: " + Math.pow(4, 2));
        System.out.println("-------------------------");

        // Négyzetgyök számítása
        System.out.println("Négyzetgyök számítása:");
        System.out.println("A 16 négyzetgyöke: " + Math.sqrt(16));
        System.out.println("A 25 négyzetgyöke: " + Math.sqrt(25));
        System.out.println("-------------------------");

        // Két szám közül a nagyobbik kiválasztása
        System.out.println("Két szám közül a nagyobbik kiválasztása:");
        System.out.println("A 5 és a 3 közül a nagyobbik: " + Math.max(5, 3));
        System.out.println("A 2 és a 7 közül a nagyobbik: " + Math.max(2, 7));
        System.out.println("-------------------------");

        // Pseudo-veletlen szám generálása
        System.out.println("Pseudo-veletlen szám generálása:");
        System.out.println("Egy pseudo-veletlen szám: " + Math.random());
        System.out.println("Egy másik pseudo-veletlen szám: " + Math.random());
        System.out.println("-------------------------");
    }
}