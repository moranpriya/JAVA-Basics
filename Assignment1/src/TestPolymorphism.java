class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

    void run() {
        System.out.println("Bike is running");
    }
}

public class TestPolymorphism {

    public static void main(String[] args) {

        Vehicle v;        // Superclass reference
        v = new Bike();   // Subclass object

        v.run();          // Runtime polymorphism
    }
}
