public class InterfaceExample01 {
    public interface Vehicle {
        void start();
        void stop();
        void honk();
    }

    public static class Car implements Vehicle {

        @Override
        public void start() {
            System.out.println("Engine Starting...");
        }

        @Override
        public void stop() {
            System.out.println("Engine Stopping...");
        }

        @Override
        public void honk() {
            System.out.println("Beep! Beep!");
        }
    }

    public static void main(String[] args) {
        Car honda = new Car();
        Car ferrari = new Car();

        honda.start();
        honda.honk();
        honda.stop();

        ferrari.start();
        ferrari.honk();
        ferrari.start();
    }
}
