public class TestMyUtils {
    public static void main(String[] args) {
        TestMyUtilsDuplaz();
        TestMyUtilsStrlen();
    }

    public static void TestMyUtilsDuplaz() {
        int result = MyUtils.duplaz(5);
        assert result == 10 : "10-et kellene visszaadni 5re";
        System.out.println("SIKERES");
    }

    public static void TestMyUtilsStrlen() {
        int result = MyUtils.strlen("hello");
        assert result == 5 : "hello bemenetre 5-öt kellene visszaadnia";
        System.out.println("SIKERES");
    }
}