package Exercise1;

/**
 * The Circle class models a circle with a radius and color
 */

public class Circle {   // Save as "Circle.java"
    //  private instance variable, not accessible from outside this class
    private double radius;
    private String color;


    // Constructors (overload)
    /** Constructors a circle instance with default value for radius and color */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /** Constructors a circle instance with given radius and default color */
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    /** Constructors a circle instance with given radius and color */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the color */
    public String getColor() {
        return color;
    }

    /** Set the value of radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Set the value of color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }

}











