public class Main
{
    public static void main(String[] args) {
        int x=6;
        assert x%2==0;

        x=7;
        assert x%2==0:"páros szám kell";

    }
}