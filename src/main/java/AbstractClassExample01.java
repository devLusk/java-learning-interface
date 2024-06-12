/**
 * An abstract class is a class that cannot be instantiated directly
 * and may contain abstract methods (without implementation) and concrete methods (with implementation).
 * Compared to an interface, an abstract class can contain default implementations for some methods,
 * while an interface can only declare methods, leaving the implementation to the classes that implement it.
 */

public class AbstractClassExample01 {
    abstract static class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzzz");
        }
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("wee wee");
        }
    }

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
