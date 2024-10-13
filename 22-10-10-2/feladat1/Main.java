public class Main
{
    public static void main(String[] args) {
        Car a1 = new Car("abc-123", "Toyota", 1.1, "szürke");
        Car a2 = new Car("Xyt-697", "Renault", 4.2, "fekete");
        Car a3 = new Car("CBA-420", "Audi", 1.3, "zöld");

        System.out.println(a1); // Car(Toyota (ABC-123), szürke, 1.10t)
        System.out.println(a2.getBrand()); // Renault
        System.out.println(a3.getColor()); // zöld
        System.out.println(a3.getWeight()); // 1.3
        System.out.println(a1.isLighterThan(a2)); // true
        System.out.println(a2.isLighterThan(a3)); // false
        System.out.println(a2.isLighterThan(a1)); // false
        System.out.println(a2.requiresCLicense()); // true
        System.out.println(a3.requiresCLicense()); // false
        System.out.println(a2.getLicensePlateNumber()); // XYT-697
    }
}