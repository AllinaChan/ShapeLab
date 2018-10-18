public class ETriangle extends Shape
{
    private int side;

    /**
     * getArea returns the Area of the equilaterial triangle
     * getPerimeter returns the Perimeter of the equilateral triangle
     *
     * @param side one of the 3 equal sides of the triangle
     */
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
