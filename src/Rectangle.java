public class Rectangle extends Shape {
    private int height;
    private int width;


    /**
     *
     * @param height is the height of the rectangle.
     * @param width is the width of the rectangle.
     */
    public Rectangle (int height, int width){
        super("Rectangle");
        this.height = height;
        this.width = width;
    }
    public Rectangle (int side)
    {
        super ("Square");
        this.height = side;
        this.width = side;
    }

    /**
     *
     * @return height * width to find the area.
     */
    public double getArea() {
        return height*width;
    }

    /**
     *
     * @return 2*height plus width*2 to find the perimeter.
     */
    public double getPerimeter(){
        return (2*height) + (2*width);
    }
}
