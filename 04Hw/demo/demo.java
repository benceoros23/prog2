import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Character osztály metódusai
        System.out.println("Character osztály metódusai:");
        System.out.println("1. isDigit(char ch)");
        char digitChar = '5';
        System.out.println("Ellenőrzés: '" + digitChar + "' egy számjegy? " + Character.isDigit(digitChar));
        
        System.out.println("------------------------------------------------");
        
        System.out.println("2. toUpperCase(char ch)");
        char lowerChar = 'a';
        System.out.println("Nagybetűs alak: '" + lowerChar + "' -> '" + Character.toUpperCase(lowerChar) + "'");
        
        System.out.println("------------------------------------------------");
        
        // Integer osztály metódusai
        System.out.println("Integer osztály metódusai:");
        System.out.println("1. parseInt(String s)");
        String intString = "123";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("String -> int: '" + intString + "' -> " + parsedInt);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("2. toString(int i)");
        int intValue = 456;
        System.out.println("int -> String: " + intValue + " -> '" + Integer.toString(intValue) + "'");
        
        System.out.println("------------------------------------------------");
        
        // Double osztály metódusai
        System.out.println("Double osztály metódusai:");
        System.out.println("1. parseDouble(String s)");
        String doubleString = "3.14";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("String -> double: '" + doubleString + "' -> " + parsedDouble);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("2. toString(double d)");
        double doubleValue = 7.89;
        System.out.println("double -> String: " + doubleValue + " -> '" + Double.toString(doubleValue) + "'");
        
        System.out.println("------------------------------------------------");
        
        // Boolean osztály metódusai
        System.out.println("Boolean osztály metódusai:");
        System.out.println("1. parseBoolean(String s)");
        String booleanStringTrue = "true";
        boolean parsedBooleanTrue = Boolean.parseBoolean(booleanStringTrue);
        System.out.println("String -> boolean: '" + booleanStringTrue + "' -> " + parsedBooleanTrue);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("2. toString(boolean b)");
        boolean booleanValue = false;
        System.out.println("boolean -> String: " + booleanValue + " -> '" + Boolean.toString(booleanValue) + "'");
        
        System.out.println("------------------------------------------------");
        
        scanner.close();
    }
}
