public class ETriangle extends Shape
{
    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    @Override
    public double getArea() {
        return (side*side)*((Math.sqrt(3.0))/4);
    }

    @Override
    public double getPerimeter()
    {
        return side*3;
    }
}
