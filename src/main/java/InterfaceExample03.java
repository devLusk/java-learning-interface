import java.util.ArrayList;
import java.util.List;

public class InterfaceExample03 {

    interface Shape {
        double perimeter();
        double area();
    }

    static void showResult(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("\n");
    }

    static class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return 2 * (3.14 * radius);
        }

        @Override
        public double area() {
            return 3.14 * (radius * radius);
        }
    }

    static class Triangle implements Shape {
        double base;
        double height;
        double side01;
        double side02;
        double side03;

        public Triangle(double base, double height, double side01, double side02, double side03) {
            this.base = base;
            this.height = height;
            this.side01 = side01;
            this.side02 = side02;
            this.side03 = side03;
        }

        @Override
        public double perimeter() {
            return side01 + side02 + side03;
        }

        @Override
        public double area() {
            return 0.5 * (base * height);
        }
    }

    static class Rectangle implements Shape {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double perimeter() {
            return (length + width) * 2;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    static class Diamond implements Shape {
        double length;
        double diagonal01;
        double diagonal02;

        public Diamond(double length, double diagonal01, double diagonal02) {
            this.length = length;
            this.diagonal01 = diagonal01;
            this.diagonal02 = diagonal02;
        }

        @Override
        public double perimeter() {
            return length * 4;
        }

        @Override
        public double area() {
            return (diagonal01 * diagonal02) / 2;
        }
    }

    static class Square implements Shape {
        double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double perimeter() {
            return side * 4;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Triangle(4, 2, 5, 12, 3));
        shapes.add(new Rectangle(8, 10));
        shapes.add(new Diamond(12, 4, 8));
        shapes.add(new Square(4));

        for(int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            showResult(shape);
        }
    }
}