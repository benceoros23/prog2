
public class TestMainVUtils {
    public static void main(String[] args) {
        testVerem();
    }

    public static void testVerem() {
        Verem v1 = new Verem();

        assert v1.toString().equals("[");
        assert v1.size() == 0;
        assert v1.isEmpty();
        v1.append(2);
        v1.append(4);
        v1.append(6);
        assert v1.toString().equals("[2, 4, 6");
        assert v1.size() == 3;
        assert !v1.isEmpty();
        int top = v1.pop();
        assert top == 6;
        assert v1.toString().equals("[2, 4");
        assert v1.size() == 2;

        Verem v2 = new Verem(List.of(2, 4, 7));
        assert v2.toString().equals("[2, 4, 7");

        System.out.println("OK");
    }
}
