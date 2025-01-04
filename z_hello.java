
public class z_hello {
     public static void main(String[] args) {
          System.out.println("Welcome to 2nd Semester!");
          System.out.println("Hello, Java!");
          System.out.println("*".repeat(20));

          System.out.println("Car1");
          Car myCar = new Car("Toyota", "Corolla", 2020);
          System.out.println("Brand: " + myCar.getBrand());
          System.out.println("Model: " + myCar.getModel());
          System.out.println("Year: " + myCar.getYear());
          System.out.println("*".repeat(20));

          System.out.println("Car2");
          Car myCar2 = new Car("Honda", "Civic", 2021);
          System.out.println("Brand: " + myCar2.getBrand());
          System.out.println("Model: " + myCar2.getModel());
          System.out.println("Year: " + myCar2.getYear());
          // myCar.start();
          // myCar.stop();
     }
}

// สร้าง class Car ที่มี attribute คือ brand, model, year และ method คือ
// start() และ stop() โดยให้ method start() และ stop() แสดงข้อความว่า "The car
// is starting." และ "The car is stopping." ตามลำดับ
class Car {
     private String brand;
     private String model;
     private int year;

     public Car(String brand, String model, int year) {
          this.brand = brand;
          this.model = model;
          this.year = year;
     }

     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public int getYear() {
          return year;
     }

     public void start() {
          System.out.println("The car is starting.");
     }

     public void stop() {
          System.out.println("The car is stopping.");
     }
}
