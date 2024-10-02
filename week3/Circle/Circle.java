public class Circle {
    private double r;

    public Circle(double r){
        this.r=r;
    }

    public double perimeter() {
        return 2* this.r * Math.PI;
    }

    public double area() {
        return this.r* this.r * Math.PI;
    }

    public boolean isSmallerThan(Circle c2)
    {
        return this.r < c2.r;
    }

    public double getR(){
        return this.r;
    }
    public void setR(double newR)
    {
        this.r=newR;
    }
}