public class Main{

    public static void main(String[] args){
        Circle c1=new Circle(4.5);
        Circle c2=new Circle(8.7);
        
        System.out.println(c1);
        System.out.println(c2);

        if(c1.isSmallerThan(c2))
            System.out.println("smaller");
        else
            System.out.println("not smaller");
    }

}