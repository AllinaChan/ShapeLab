/**
 * @param radius- The radius of the circle
 */
public class Circle extends Shape
{
    private int radius;

    public Circle (int radius)
    {
        super("Cirle");
        this.radius = radius;
    }
    @Override
    //This returns the area of the circle
    public double getArea()
    {
        return Math.PI* radius*radius;
    }
   //This returns the perimeter (circumference) of the circle
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
