public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rexi", "németjuhász", "Hím", 32.62);
        Dog d2 = new Dog("Keyush", "husky", "hÍM", 30.10);
        Dog d3 = new Dog("Csipesz", "csivava", "NőStény", 2);

        System.out.println(d1); // Dog(Rexi (németjuhász), hím, 32.6kg)
        System.out.println(d2.getBreed()); // husky
        System.out.println(d2.getGender()); // hím
        System.out.println(d3.getWeight()); // 2
        System.out.println(d1.compareWeight(d2)); // -1
        System.out.println(d3.compareWeight(d2)); // 1
        System.out.println(d3.getName()); // Csipesz
    }
}
