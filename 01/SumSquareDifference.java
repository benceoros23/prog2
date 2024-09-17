class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;

        // Az első száz természetes szám összege
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Az első száz természetes szám összegének a négyzete
        int squareOfSum = sum * sum;

        // Az első száz természetes szám négyzetösszege
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

        // A különbség kiszámítása
        int difference = squareOfSum - sumOfSquares;

        // Az eredmény kiírása
        System.out.println("Az első 100 természetes szám összegének négyzete: " + squareOfSum);
        System.out.println("Az első 100 természetes szám négyzetösszege: " + sumOfSquares);
        System.out.println("A különbség: " + difference);
    }
}
