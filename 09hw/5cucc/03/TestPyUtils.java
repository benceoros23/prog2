public class TestPyUtils {
    public static void main(String[] args) {
        TestPyUtilsRange();
        TestHelloString();
    }

    public static void TestPyUtilsRange() {

        assert PyUtils.range(4, 20, 2).equals(List.of(4, 6, 8, 10, 12, 14, 16, 18));
        assert PyUtils.range(4, 10, 1).equals(List.of(4, 5, 6, 7, 8, 9));
        assert PyUtils.range(0, 5).equals(List.of(0, 1, 2, 3, 4));
        assert PyUtils.range(3, 7).equals(List.of(3, 4, 5, 6));
        assert PyUtils.range(3, 4).equals(List.of(3));
        assert PyUtils.range(3, 3).isEmpty();
        assert PyUtils.range(10).equals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("OK");
    }

    public static void TestHelloString() {

        String hello = "hello";
        assert hello.charAt(0) == 'h';
        assert hello.charAt(1) == 'e';
        assert hello.charAt(2) == 'l';
        assert hello.charAt(3) == 'l';
        assert hello.charAt(4) == 'o';
        
        System.out.println("OK");
    }
    
    
}
