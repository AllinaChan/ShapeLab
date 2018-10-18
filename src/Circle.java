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
    /**
     * @return The area of the circle
     */
    public double getArea()
    {
        return Math.PI* radius*radius;
    }

    /**
     * @return The area of the circle
     */
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
