import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class factory {

     // Map to store cars grouped by brand
     private Map<String, List<Car>> carBrandMap = new HashMap<>();

     // Method to add a new car to the factory
     public void addCar(String brand, String model, int year) {
          Car newCar = new Car(brand, model, year);

          // Grouping cars by brand
          carBrandMap.putIfAbsent(brand, new ArrayList<>());
          carBrandMap.get(brand).add(newCar);

          System.out.println("Added: " + brand + " " + model + " (" + year + ")");
     }

     // Method to display cars grouped by brand
     public void displayCarsGroupedByBrand() {
          System.out.println("\nDisplaying cars grouped by brand:");
          for (String brand : carBrandMap.keySet()) {
               System.out.println("Brand: " + brand);
               List<Car> cars = carBrandMap.get(brand);
               for (int i = 0; i < cars.size(); i++) {
                    Car car = cars.get(i);
                    System.out.println("    Model: " + car.getModel() + " " + car.getYear());
               }
          }
     }

     public static void main(String[] args) {
          System.out.println("===== factory =====");
          System.out.println("This is the factory class.");
          System.out.println("===================");

          factory factory = new factory();

          factory.addCar("Honda", "City", 2025);
          factory.addCar("Honda", "Civic", 2025);
          factory.addCar("Toyota", "Corolla", 2025);
          factory.addCar("Toyota", "Camry", 2024);
          factory.addCar("Honda", "Accord", 2025);

          factory.displayCarsGroupedByBrand();
     }
}
