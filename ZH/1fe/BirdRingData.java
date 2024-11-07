public final class BirdRingData {
    private final String ringNumber;
    private final String species;
    private final double fatScore;
    private final double muscleScore;
    private final double weight;
    private final double wingLength;

    // Konstruktor, amely biztosítja az érvényes adatokat
    public BirdRingData(String ringNumber, String species, double fatScore, double muscleScore, double weight, double wingLength) {
        
        this.ringNumber = ringNumber;
        this.species = species;
        this.fatScore = fatScore;
        this.muscleScore = muscleScore;
        this.weight = weight;
        this.wingLength = wingLength;
    }

    // Lekérdező metódusok
    public String getRingNumber() {
        return ringNumber;
    }

    public String getSpecies() {
        return species;
    }

    public double getFatScore() {
        return fatScore;
    }

    public double getMuscleScore() {
        return muscleScore;
    }

    public double getWeight() {
        return weight;
    }

    public double getWingLength() {
        return wingLength;
    }

    // Testkondíciós index kiszámítása
    public double calculateBodyConditionIndex() {
        return weight / Math.pow(wingLength / 10.0, 2);
    }

    // Egészségi állapot értékelése a zsír- és izompontszámok alapján
    public String assessHealthStatus() {
        if (fatScore <= 3 && muscleScore <= 1) {
            return "Alultáplált";
        } else if (fatScore <= 5 && muscleScore >= 1) {
            return "Egészséges";
        } else {
            return "Túlsúlyos";
        }
        
    }

    // A példány adatainak kiíratásához
    @Override
    public String toString() {
        return "Madárgyűrűzési adatok:\n" +
               "- Gyűrűszám: " + ringNumber + "\n" +
               "- Madárfaj: " + species + "\n" +
               "- Zsírtartalom: " + fatScore + "\n" +
               "- Izomtömeg: " + muscleScore + "\n" +
               "- Tömeg: " + String.format("%.2f", weight) + " g\n" +
               "- Szárnyhossz: " + wingLength + " mm";
    }
}
