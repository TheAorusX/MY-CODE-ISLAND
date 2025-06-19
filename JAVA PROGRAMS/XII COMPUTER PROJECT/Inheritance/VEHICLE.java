import java.util.*;
class Vehicle {
    String brand, model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
public class VEHICLE{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Bike bike = new Bike("Honda", "CBR", true);

        car.displayDetails();
        bike.displayDetails();
    }
}
