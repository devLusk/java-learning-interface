public class InterfaceExample01 {
    public interface Vehicle {
        void start();
        void stop();
        void honk();
    }

    public static class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car Engine Starting...");
        }

        @Override
        public void stop() {
            System.out.println("Car Engine Stopping...");
        }

        @Override
        public void honk() {
            System.out.println("Car Beep! Beep!");
        }
    }

    public static class Bike implements Vehicle {

        @Override
        public void start() {
            System.out.println("Bike Engine Starting...");
        }

        @Override
        public void stop() {
            System.out.println("Bike Engine Stopping...");
        }

        @Override
        public void honk() {
            System.out.println("Bike Beep! Beep!");
        }
    }

    public static void main(String[] args) {
        Vehicle honda = new Car();
        Vehicle ferrari = new Car();
        Vehicle yamaha = new Bike();

        executingFunctions(honda, new String[]{"start", "honk", "stop"});
        executingFunctions(ferrari, new String[]{"start", "stop"});
        executingFunctions(yamaha, new String[]{"start", "honk"});
    }

    public static void executingFunctions(Vehicle vehicle, String[] funcs) {
        for (String func : funcs) {
            switch (func) {
                case "start":
                    vehicle.start();
                    break;
                case "honk":
                    vehicle.honk();
                    break;
                case "stop":
                    vehicle.stop();
                    break;
                default:
                    System.out.println("Unknown function: " + func);
            }
        }
    }
}