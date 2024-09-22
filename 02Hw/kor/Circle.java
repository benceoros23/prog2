import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double kerulet() {
        return 2 * Math.PI * radius;
    }

    public double terulet() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a kör sugarának a hosszát: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("A kör kerülete: %.2f%n", circle.kerulet());
        System.out.printf("A kör területe: %.2f%n", circle.terulet());
    }
}