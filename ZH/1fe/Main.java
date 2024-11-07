public class Main {
    public static void main(String[] args) {
        BirdRingData blueTit = new BirdRingData(
            "H2000051501",
            "Cyanistes caeruleus",
            5.0,
            2.0,
            12.5,
            70.0
        );

        BirdRingData cormorant = new BirdRingData(
            "H2000051503",
            "Phalacrocorax carbo",
            6.0,
            1.0,
            35.0,
            120.0
        );

        System.out.println(blueTit);  // Példány kiíratása
        System.out.println(cormorant.getRingNumber());  // H2000051503
        System.out.println(cormorant.getSpecies());  // Phalacrocorax carbo
        System.out.println(cormorant.getFatScore());  // 6.0
        System.out.println(cormorant.getMuscleScore());  // 1.0
        System.out.println(cormorant.getWeight());  // 35.0
        System.out.println(cormorant.getWingLength());  // 120.0

        System.out.printf("%.2f\n", blueTit.calculateBodyConditionIndex());  // 0.26
        System.out.println(blueTit.assessHealthStatus());  // Egészséges
        System.out.println(cormorant.assessHealthStatus());  // Túlsúlyos
    }
}
