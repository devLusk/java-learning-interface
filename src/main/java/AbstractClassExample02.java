import java.util.Scanner;

public class AbstractClassExample02 {
    abstract static class Shape {
        public abstract void calcArea();
    }

    public static class Rectangle extends Shape {
        int height = 10;
        int length = 20;

        public void calcArea() {
            int area = height * length;
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calcArea();
    }
}