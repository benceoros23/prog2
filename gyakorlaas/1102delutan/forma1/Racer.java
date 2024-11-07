public class Racer {
    private final String name;
    private final String team;
    private final int races;
    private final int wins;
    private final double fastestLap;

    public Racer(String name,String team, int races,  int wins,double fastestLap) {
        
        this.name = name;
        this.team = team;
        this.races = races;
        this.wins = wins;
        this.fastestLap = fastestLap;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getRaces() {
        return races;
    }

    public int getWins() {
        return wins;
    }

    public double getFastestLap() {
        return fastestLap;
    }
    public double getWinPercentage() {
        return  (double) wins / races * 100;
    }
    public boolean comparePerformance(Racer other) {
        return this.getWinPercentage() > other.getWinPercentage();
    }

    @Override
    public String toString() {
        return String.format("Versenyző adatok:\n- Név: %s\n- Csapat: %s\n- Versenyek: %d\n- Győzelmek: %d\n- Leggyorsabb kör: %.2f mp", 
                             name, team, races, wins, fastestLap);
    }
    


}
