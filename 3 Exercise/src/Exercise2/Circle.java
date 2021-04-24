package Exercise2;

public class Circle extends Shape{
    private double radius;


    // Constructors (overload)
    /** Constructors a shape instance with default value for radius,
     *  filled and color */
    public Circle() {
        radius = 1.0;
    }

    /** Constructors a shape instance with default value for filled
     *  and color and given value for radius */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Constructors a shape instance with given value for filled,
     *  radius, and color */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Returns the value of radius */
    public double getRadius() {
        return radius;
    }

    /** Set the value of radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // A public method to return the area of circle
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    // A public method to return the perimeter of circle
    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ", radius=" + radius +
                "]";
    }

    //    public String toString() {
//        return "Circle: subclass of " + super.toString()
//                + ", radius = " + getRadius() + "]";
//    }
}
