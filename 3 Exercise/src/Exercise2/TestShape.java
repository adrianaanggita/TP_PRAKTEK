package Exercise2;

public class TestShape {
    public static void main (String[] args) {
        // Declare and allocate a new instance of shape
        // specifying with default color and filled
        Shape s1 = new Shape();
        System.out.println("S1 Before with default color and filled\n"
                + "Shape["
                + "color = " + s1.getColor()
                + ", filled = " + s1.isFilled() +
                "]");

        // Change the default color and filled of s1
        s1.setColor("green");
        s1.setFilled(false);
        System.out.println("\nS1 After Setter\n" + s1.toString());

        // Declare and allocate a new instance of shape
        // specifying with given color and filled
        Shape s2 = new Shape("purple", true);
        System.out.println("\nS2 with given color and filled\n"
                + s2.toString());
    }
}
