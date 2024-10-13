public class Main {
    public static void main(String[] args) {
        Processor p1 = new Processor("Intel Core i5-2500 @ 3.30GHz");
        Processor p2 = new Processor("Intel Core i5-2500K @ 3.30GHz");
        Processor p3 = new Processor("Intel Core i5-2310 @ 2.90GHz");
        Processor p4 = new Processor("AMD Phenom II X6 1065T");
        Processor p5 = new Processor("AMD Phenom II X6 1075T");
        Processor p6 = new Processor("AMD Phenom II X6 1090T");

        System.out.println(p1); // Intel Core i5-2500 @ 3.30GHz
        System.out.println(p4); // AMD Phenom II X6 1065T
        System.out.println(p1.isIntel()); // true
        System.out.println(p6.isIntel()); // false
        System.out.println(p3.isAmd()); // false
        System.out.println(p5.isAmd()); // true
        System.out.println(p1.getClockSpeed()); // 3.30
        System.out.println(p4.getClockSpeed()); // -1.0
        System.out.println(p3.cmpClockSpeed(p1)); // -1
        System.out.println(p1.cmpClockSpeed(p2)); // 0
        System.out.println(p1.cmpClockSpeed(p3)); // 1
        System.out.println(p3.cmpClockSpeed(p4)); // -2
    }
}
