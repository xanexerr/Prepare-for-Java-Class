public class BMICalculator {
     // Name: Natthapumin Klammat
     // ID: 6787028
     // Section: 1
     public static void main(String[] args) {
          java.util.Scanner input = new java.util.Scanner(System.in);

          System.out.print("Weight : ");
          double weight = input.nextDouble();

          System.out.print("Height : ");
          double height = input.nextDouble();

          double bmi = weight / (height * height);

          System.out.printf("%.2f%n", bmi);

          if (bmi < 18.5) {
               System.out.println("Underweight");
          } else if (bmi < 24.9) {
               System.out.println("Normal weight");
          } else if (bmi < 29.9) {
               System.out.println("Overweight");
          } else {
               System.out.println("Obesity");
          }
          input.close();
     }
}
