public class Main  
{
    public static void main(String[] args) {
        Athlete athlete = new Athlete("Usain Bolt", "Atlétika", 35, 9.58, 25);

        System.out.println(athlete);
        System.out.println("Veterán sportoló? " + athlete.isVeteran());
        athlete.improveRecord(9.50);
    }

}