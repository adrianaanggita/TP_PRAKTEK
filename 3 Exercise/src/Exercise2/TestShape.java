package Exercise2;

public class TestShape {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1 with default value for radius, color, and filled\n"
                + "radius = " + c1.getRadius()
                + "\ncolor = " + c1.getColor()
                + "\nfilled = " + c1.isFilled()
                + "\narea = " + c1.getArea()
                + "\nperimeter = " + c1.getPerimeter());

        Circle c2 = new Circle(7, "magenta", false);
        System.out.println("\nCircle 2 with given value for radius, color, and filled\n"
                + "radius = " + c2.getRadius()
                + "\ncolor = " + c2.getColor()
                + "\nfilled = " + c2.isFilled()
                + "\narea = " + c2.getArea()
                + "\nperimeter = " + c2.getPerimeter());

        Rectangle r1 = new Rectangle();
        System.out.println("\nRectangle 1 with default value for width, length, \n" +
                "color, and filled\n"
                + "width = " + r1.getWidth()
                + "\nlength = " + r1.getLength()
                + "\ncolor = " + r1.getColor()
                + "\nfilled = " + r1.isFilled()
                + "\narea = " + r1.getArea()
                + "\nperimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(4, 5);
        System.out.println("\nRectangle 2 with given value for width, length, \n" +
                "and default value for color, and filled\n"
                + "width = " + r2.getWidth()
                + "\nlength = " + r2.getLength()
                + "\ncolor = " + r2.getColor()
                + "\nfilled = " + r2.isFilled()
                + "\narea = " + r2.getArea()
                + "\nperimeter = " + r2.getPerimeter());

        Rectangle r3 = new Rectangle(6, 5, "sage green", false);
        System.out.println("\nRectangle 3 with given value for width, length, \n" +
                "color, and filled\n"
                + "width = " + r3.getWidth()
                + "\nlength = " + r3.getLength()
                + "\ncolor = " + r3.getColor()
                + "\nfilled = " + r3.isFilled()
                + "\narea = " + r3.getArea()
                + "\nperimeter = " + r3.getPerimeter());

        Square q1 = new Square();
        System.out.println("\nSquare 1 with default value for side, \n" +
                "color, and filled\n"
                + "side = " + q1.getSide()
                + "\ncolor = " + q1.getColor()
                + "\nfilled = " + q1.isFilled()
                + "\narea = " + q1.getArea()
                + "\nperimeter = " + q1.getPerimeter());

        Square q2 = new Square(5);
        System.out.println("\nSquare 2 with given value for side, \n" +
                "and default value for color, and filled\n"
                + "side = " + q2.getSide()
                + "\ncolor = " + q2.getColor()
                + "\nfilled = " + q2.isFilled()
                + "\narea = " + q2.getArea()
                + "\nperimeter = " + q2.getPerimeter());

        Square q3 = new Square(9, "lavender", false);
        System.out.println("\nSquare 3 with given value for side, \n" +
                "color, and filled\n"
                + "side = " + q3.getSide()
                + "\ncolor = " + q3.getColor()
                + "\nfilled = " + q3.isFilled()
                + "\narea = " + q3.getArea()
                + "\nperimeter = " + q3.getPerimeter());
    }
}
