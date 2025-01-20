class Car {
     private String brand;
     private String model;

     public Car(String brand, String model) {
          this.brand = brand;
          this.model = model;
     }

     public String getBrand() {
          return brand;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public void displayInfo() {
          System.out.println("Brand: " + brand + ", Model: " + model);
     }
}


class ElectricCar extends Car {
     private int batteryCapacity;

     public ElectricCar(String brand, String model, int batteryCapacity) {
          super(brand, model);
          this.batteryCapacity = batteryCapacity;
     }

     public void displayInfo() {
          super.displayInfo(); 
          System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
     }
}


class HybridCar extends Car {
     private int fuelCapacity;

     public HybridCar(String brand, String model, int fuelCapacity) {
          super(brand, model);
          this.fuelCapacity = fuelCapacity;
     }

     @Override
     public void displayInfo() {
          super.displayInfo();
          System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
     }
}

abstract class Vehicle {
     abstract void startEngine();
}

class Motorbike extends Vehicle {
     @Override
     void startEngine() {
          System.out.println("Motorbike engine started.");
     }
}

public class Main {
     public static void main(String[] args) {
          Car car = new Car("Toyota", "Corolla");
          ElectricCar eCar = new ElectricCar("Tesla", "Model S", 100);
          HybridCar hCar = new HybridCar("Toyota", "Prius", 45);
          Motorbike bike = new Motorbike();

          car.displayInfo();
          eCar.displayInfo();
          hCar.displayInfo();
          bike.startEngine();
     }
}
