package Exercise2;

public class Square extends Rectangle {

    // Constructors (overload)
    /** Constructors a square instance with default value for length, width,
     *  color, and filled */
    public Square() {
        super();
    }

    /** Constructors a rectangle instance with default value for color and filler
     *  and given value for width and length */
    public Square(double side) {
        super(side, side);
    }

    /** Constructors a rectangle instance with given value for width, length,
     *  color, and filled */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** Returns the value of Side */
    public double getSide() {
        return super.getLength();
    }

    /** Set the value of side */
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

    /** There's no need to override the getArea and getPerimeter method
     * because Square class inherits the instance variables
     * width and length from its superclass Rectangle
     */
}
