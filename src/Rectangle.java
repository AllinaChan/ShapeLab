public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle (int height, int width){
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height*width;
    }

    public double getPerimeter(){
        return (2*height) + (2*width);
    }
}
