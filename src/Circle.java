public class Circle extends Shape
{
    private int radius;

    public Circle (int radius)
    {
        super("Cirle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI* radius*radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
