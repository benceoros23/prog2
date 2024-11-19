public class MasodikTest {
    public static void main(String[] args) {
        tesztMasodik();
    }

    public static void tesztMasodik() {
        int n = 123;
        long n2 = n;
        assert n2 == 123L : "123L-t kellene visszaadnia";
        System.out.println("SIKERES");

        double p = 3.14;
        float p2 = (float) p;
        assert p2 == 3.14f : "3.14f-et kellene visszaadnia";
        System.out.println("SIKERES");

        String d = "7.89";
        double d2 = Double.parseDouble(d);
        assert d2 == 7.89 : "7.89-et kellene visszaadnia";
        System.out.println("SIKERES");

        String a = "a";
        char a2 = a.charAt(0);
        assert a2 == 'a' : "'a'-t kellene visszaadnia ";
        System.out.println("SIKERES");
    }
}