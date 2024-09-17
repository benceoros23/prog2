class Main
{
    public static void main(String[] args) {
        int sum = 0;
        
        // Végigmegyünk az 1000-nél kisebb számokon
        for (int i = 1; i < 1000; i++) {
            // Ha a szám 3-mal vagy 5-tel osztható, hozzáadjuk az összeghez
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        
        // Az eredmény kiírása
        System.out.println("Az 1000-nél kisebb, 3-mal vagy 5-tel osztható számok összege: " + sum);
    }
}
