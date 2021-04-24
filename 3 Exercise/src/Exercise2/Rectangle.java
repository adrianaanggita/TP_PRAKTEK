package Exercise2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    // Constructors (overload)
    /** Constructors a rectangle instance with default value for length, width,
     *  color, and filled */
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    /** Constructors a rectangle instance with default value for color and filler
     *  and given value for width and length */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /** Constructors a rectangle instance with given value for width, length,
     *  color, and filled */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this .width = width;
    }

    /** Returns the value of width */
    public double getWidth() {
        return width;
    }

    /** Returns the value of length */
    public double getLength() {
        return length;
    }

    /** Set the value of width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Set the value of length */
    public void setLength(double length) {
        this.length = length;
    }

    // A public method to return the area of rectangle
    public double getArea() {
        return getLength() * getWidth();
    }

    // A public method to return the perimeter of rectangle
    public double getPerimeter() {
        return getLength() * 2 + getWidth() * 2;
    }

    @Override
    public String toString() {
        return "Rectangle [" + super.toString() +
                ", width =" + width +
                ", length =" + length +
                "]";
    }
}
