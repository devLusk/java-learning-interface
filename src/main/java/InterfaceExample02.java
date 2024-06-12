import java.util.Scanner;

public class InterfaceExample02 {
    public interface Shape {
        public void Square();

        public void Circle();

        public void Triangle();

        public void Rectangle();
    }

    public static class ShapeArea implements Shape {
        Scanner scn = new Scanner(System.in);

        @Override
        public void Square() {
            System.out.println("Enter the length of the square: ");
            double l = scn.nextInt();

            System.out.println("Enter the width of the square: ");
            double w = scn.nextInt();

            double areaOfSquare = l * w;

            System.out.println("The area of the square is: " + areaOfSquare);
        }

        @Override
        public void Circle() {
            System.out.println("Enter the radius of the circus: ");
            double r = scn.nextInt();

            double areaOfCircle = 3.142 * r * r;

            System.out.println("The area of the circle is: " + areaOfCircle);
        }

        @Override
        public void Triangle() {
            System.out.println("Enter the base of the triangle: ");
            double base = scn.nextInt();

            System.out.println("Enter the height of the triangle");
            double h = scn.nextInt();

            double areaOfTriangle = 0.5 * base * h;

            System.out.println("The area of the triangle is: " + areaOfTriangle);
        }

        @Override
        public void Rectangle() {
            System.out.println("Enter the length of the rectangle: ");
            double l = scn.nextInt();

            System.out.println("Enter the width of the rectangle: ");
            double w = scn.nextInt();

            double areaOfRectangle = l * w;

            System.out.println("The area of the rectangle is: " + areaOfRectangle);
        }
    }

    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();

        shapeArea.Square();
        shapeArea.Circle();
        shapeArea.Triangle();
        shapeArea.Rectangle();
    }
}
