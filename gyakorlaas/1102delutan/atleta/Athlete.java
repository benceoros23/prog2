public class Athlete {
    private final String name;
    private final String sport;
    private final int age;
    private final double recordTime;
    private final int competitions;

    public Athlete(String name, String sport, int age, double recordTime, int competitions) {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.recordTime = recordTime;
        this.competitions = competitions;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public int getCompetitions() {
        return competitions;
    }

    public boolean isVeteran() {
        return age > 40;
    }

    public void improveRecord(double newTime)
    {
        if (newTime < recordTime)
        {
            System.out.println("Új rekord idő: " + newTime);
        }
    }
    @Override
    public String toString() {
        return String.format("Sportoló adatok:\n- Név: %s\n- Sportág: %s\n- Életkor: %d\n- Legjobb idő: %.2f mp\n- Versenyek száma: %d", 
                             name, sport, age, recordTime, competitions);
    }
    
}
