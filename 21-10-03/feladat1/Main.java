public class Main {
    public static void main(String[] args) {
        Monitor m0 = new Monitor("1024x 768");
        Monitor m1 = new Monitor("1366 x 768");
        Monitor m2 = new Monitor("1920x1080");
        Monitor m3 = new Monitor("3840 x2160");

        System.out.println(m0); // Monitor(1024x768)
        System.out.println(m1.getWidth()); // 1366
        System.out.println(m1.getHeight()); // 768
        System.out.println(m2.getNumberOfPixels()); // 2073600
        System.out.println(m0.isFullHD()); // false
        System.out.println(m2.isFullHD()); // true
        System.out.println(m3.isFullHD()); // false
        System.out.println(m0.getRatio()); // 1.3333333333333333
        System.out.println(m0.compare(m2)); // -1
        System.out.println(m1.compare(m1)); // 0
        System.out.println(m3.compare(m1)); // 1
    }
}
