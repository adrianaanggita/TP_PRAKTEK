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
        return getArea()*height;
    }
}
