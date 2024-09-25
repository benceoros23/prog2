public class MethodExp{

    static String greeting(String name)
    {
        String result=String.format("Hello %s!\n",name);
        return result;
    }

    

    static int duplaz(int szam)
    {
        return szam*2;
    }
    
    public static void main (String[] args)
    {
        String greetingUser=greeting("Anna");
        System.out.println(greetingUser);
        System.out.println(greeting("Bence"));

        int result=duplaz(2);
        System.out.println(result);
        System.out.println("-",repeat(5));
    }
}