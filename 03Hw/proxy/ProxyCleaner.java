public class ProxyCleaner {

    public static String cleanProxyAddress(String proxyAddress) {
        return proxyAddress.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String dirtyProxy1 = "192.20.246.138:\n 6666";
        String dirtyProxy2 = "206.130.99.82:\n8080";

        System.out.println(cleanProxyAddress(dirtyProxy1)); // 192.20.246.138:6666
        System.out.println(cleanProxyAddress(dirtyProxy2)); // 206.130.99.82:8080
    }
}
