public class StringExample {
    public static void main (String[] args){
        String s=new String("Hello");
        String s2="World";
        System.out.println(s2.charAt(1));
        System.out.println(s + " "+s2);

         String s3="batman";

        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(3,6));
        System.out.println(s3.substring(1,4));

        String videogame= "Fallout: New Vegas";
        System.out.println(videogame.substring(4,7));
        System.out.println(videogame.substring(13));

        System.out.println(s3.toUpperCase().substring(0,3));

        String languages= "Java, C, C++, C#, python";
        System.out.println(languages.length());
        System.out.println(languages.toUpperCase());
        System.out.println(languages);
        System.out.println(languages.toLowerCase());
        System.out.println(languages.indexOf('a'));
        System.out.println(languages.indexOf("va"));
        System.out.println(languages.indexOf('x'));
        System.out.println(languages.trim());
        System.out.println(languages.startsWith("Java"));
        System.out.println(languages.startsWith("C"));
        System.out.println(languages.endsWith("python")); 
        System.out.println(languages.contains("++"));
        System.out.println(languages.contains("pascal"));
        System.out.println(languages.replace("python", "Python"));

        System.out.println("Hello" + 6);
        System.out.println("" + 'a'+ 'b' + 3.14);

        
        
        
    }
}