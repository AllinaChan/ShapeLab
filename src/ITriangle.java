public class ITriangle extends Shape {
    private int height;
    private int base;
    public ITriangle(int height, int base) {
        super("ITriangle");
        this.height=height;
        this.base=base;
    }
    @Override
    public double getArea() {
        return (base*height)/2.0;
    }
    @Override
    public double getPerimeter() {
        return base + Math.sqrt((Math.pow(base,2)+4*Math.pow(height,2)));
    }
}
