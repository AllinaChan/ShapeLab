/**
 * @param a- The value of half the major axis of the ellipse
 * @param b- The value of half the minor axis of the ellipse
 */
public class Ellipse extends Shape {
    private int a;
    private int b;
    public Ellipse (int a, int b)
    {
        super("Ellipse");
        this.a= a;
        this.b=b;
    }
    @Override
    //This returns the area of the ellipse.
    public double getArea()
    {
        return Math.PI*a*b;
    }
    @Override
    //Many ways to approximate the perimeter of a ellipse, but this one was more code friendly
    public double getPerimeter()
    {
        double firstPerimeter= ((a*a)+(b*b))*0.5;
        return 2*Math.PI*Math.sqrt(firstPerimeter);
    }
}
