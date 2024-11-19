public class TestMain {
    public static void main(String[] args) {
        teszteldProduct();
    }

    public static void teszteldProduct() {
        int eredmeny1 = product();
        assert eredmeny1 == 1 : "1-et kellene visszaadnia";
        System.out.println("SIKERES");

        int eredmeny2 = product(2);
        assert eredmeny2 == 2 : "2-t kellene visszaadnia";
        System.out.println("SIKERES");

        int eredmeny3 = product(2, 5);
        assert eredmeny3 == 10 : "10-et kellene visszaadnia";
        System.out.println("SIKERES");

        int eredmeny4 = product(2, 5, 10);
        assert eredmeny4 == 100 : "100-at kellene visszaadnia";
        System.out.println("SIKERES");

        int eredmeny5 = product(2, 5, 10, 3);
        assert eredmeny5 == 300 : "300-at kellene visszaadnia";
        System.out.println("SIKERES");
    }

    private static int product(int... args) {
        int p = 1;
        for (int n : args) {
            p *= n;
        }
        return p;
    }
}