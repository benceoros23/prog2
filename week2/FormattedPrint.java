public class FormattedPrint{

    public static void main(String[] args)
    {
        String name="Joe";
        String profession="hacker";
        int age=22;

        System.out.println(name + " (" +profession + "), " + age );
        System.out.printf("%s (%s), %d\n", name, profession,age);
        String result=String.format("%s (%s), %d", name, profession,age);
        System.out.println(result);
    }
}