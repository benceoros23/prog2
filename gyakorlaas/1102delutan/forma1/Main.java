public class Main
{
    public static void main(String[] args) {
        Racer racer1 = new Racer("Lewis Hamilton", "Mercedes", 100, 80, 78.2);
        Racer racer2 = new Racer("Max Verstappen", "Red Bull", 100, 65, 76.5);

        System.out.println(racer1); // A versenyző összes adatának kiírása
        System.out.println("Győzelmi arány: " + racer1.getWinPercentage() + "%");
        System.out.println("Hamilton jobb-e mint Verstappen? " + racer1.comparePerformance(racer2));

    }
}