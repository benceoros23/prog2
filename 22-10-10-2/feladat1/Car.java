public class Car {
    private final String licensePlateNumber;
    private final String brand;
    private final double weight;
    private final String color;

    public Car(String licensePlateNumber, String brand, double weight, String color) {
        this.licensePlateNumber = licensePlateNumber.toUpperCase(); // Rendszám nagybetűsen
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isLighterThan(Car other)
    {
        return this.weight < other.weight;
    }

    public boolean requiresCLicense() {
        return this.weight > 3.5; // 3500 kg
    }

    @Override
    public String toString() {
        return String.format("Car(%s (%s), %s, %.2ft)", brand, licensePlateNumber, color, weight);

    }

    
}
