import java.util.Scanner;

public class ScannerExample{

    static String input(String prompt)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(prompt);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.print("Első szám: ");
        int szam1=scanner.nextInt();
        System.out.print("Második szám: ");
        int szam2=scanner.nextInt();
        System.out.println("Hello "+name);
        System.out.println(szam1+szam2);
        scanner.close();

        String name2=input("Your name: ");
    }
}