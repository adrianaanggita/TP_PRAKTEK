package Exercise2;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    // Constructors (overload)
    /** Constructors a shape instance with default value for filled and color */
    public Shape() {
        color = "red";
        filled = true;
    }

    /** Constructors a shape instance with default value for filled and color */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Returns the value of color */
    public String getColor() {
        return color;
    }

    /** Set the value of color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the value of filled */
    public boolean isFilled() {
        return filled;
    }

    /** Set the value of filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Return a self-descriptive string of this instance in the form of
     * Shape[color = ?, filled = ?] */
    public String toString() {
        return "Shape[color = " + getColor() + ", filled = " + isFilled() + "]";
    }

}
