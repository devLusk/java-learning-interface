public class ConstructorExample01 {
    static class Dog {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Preta", 12);
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}