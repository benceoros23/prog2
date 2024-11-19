public class Masodik {
    public static void main(String[] args)
    {
        /*
        * "123"   -> long
        * "3.14"  -> float
        * "7.89"  -> double
        * "a"     -> char 
        */
        
        int n = 123;
        long n2 = n;
        System.out.println(n2);

        double p = 3.14;
        float p2 = (float)p;
        System.out.println(p2);

        String d = "7.89";
        double d2 = Double.parseDouble(d);
        System.out.println(d2);

        String a = "a";
        char a2 = a.toCharArray()[0]; //vagy .charAt()
        System.out.println(a2);
    }
}
