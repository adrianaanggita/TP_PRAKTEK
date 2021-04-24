package Exercise1;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Cylinder extends Circle{  // Save as "Cylinder.java"
    private double height;  // private variable

    // Constructors (overload)
    /** Constructor with default color, radius and height */
    public Cylinder(){
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    /** Constructor with default color and height, but given radius */
    public Cylinder (double radius) {
        super(radius);
        height = 1.0;
    }

    /** Constructor with default color, but given radius and height */
    public Cylinder (double radius, double height) {
        super(radius);
        this.height = height;
    }

    /** Constructor with default color, but given radius and height */
    public Cylinder (double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base are
    public double getVolume() {
        return super.getArea() * height;
    }

    //Overriding
    // A public method for computing the area of cylinder
    // use a superclass method getArea() to get the base area
    public double getArea() {
        return (Math.PI * 2 * getRadius() *getHeight() + 2 * super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height = " + height;
    }
}
