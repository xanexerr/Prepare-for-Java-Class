import java.util.ArrayList;
import java.util.Scanner;

public class student {
     static class Student {
          private String name;
          private int age;
          private double grade;

          public String toString() {
               return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
          }
     }

     public static void main(String[] args) {
          Scanner Keyboard = new Scanner(System.in);
          ArrayList<Student> students = new ArrayList<>();

          for (int i = 1; i < 50; i++) {
               if (i % 3 == 0) {
                    System.err.print(i + " ");
               }
          }

          System.err.println("\nInput Student Info Until 'exit' is entered");
          String i = "run";
          while (!i.equals("exit")) {
               Student student1 = new Student();
               System.out.println("Enter student name:");
               student1.name = Keyboard.next();
               System.out.println("Enter student age:");
               student1.age = Keyboard.nextInt();
               System.out.println("Enter student grade:");
               student1.grade = Keyboard.nextDouble();

               students.add(student1);

               System.err.println("\nInput Student Info or enter 'exit'");
               i = Keyboard.next();

          }

          System.out.println("\nAll Student Information:");
          for (Student s : students) {
               System.out.println("GPA of " + s.name + " is: " + s.grade);
          }

          Keyboard.close();
     }
}
