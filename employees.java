import java.io.*;
import java.util.*;

public class employees {
     public static void main(String[] args) {
          Scanner Keyboard = new Scanner(System.in);

          while (true) {
               try {
                    System.out.println(":::::Menu:::::");
                    System.out.println("1. View All employees record");
                    System.out.println("2. Add a new employee record");
                    System.out.println("3. Search for an employee by name");
                    System.out.println("4. Update employee record");
                    System.out.println("5. Exit");

                    int number = Keyboard.nextInt();
                    Keyboard.nextLine(); // Consume newline

                    if (number >= 1 && number <= 5) {
                         switch (number) {
                              case 1:
                                   viewAllEmployees();
                                   break;
                              case 2:
                                   addNewEmployee();
                                   break;
                              case 3:
                                   searchEmployee();
                                   break;
                              case 4:
                                   updateEmployee();
                                   break;
                              case 5:
                                   System.exit(0);
                                   break;
                         }
                    } else {
                         System.out.println("Invalid. Please Input Again : ");
                    }
               } catch (Exception e) {
                    System.out.println("Invalid. Please Input Again : ");
                    Keyboard.nextLine(); // Clear the invalid input
               }
          }
     }

     private static void viewAllEmployees() {
          try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
               String line;
               System.out.println(":::::View All employees record:::::");
               while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    System.out.println("Name: " + parts[0] + ", Age: " + parts[1] + ", Major: " + parts[2].trim());
               }
          } catch (IOException e) {
               System.out.println("Error reading file: " + e.getMessage());
          }
     }

     private static void addNewEmployee() {
          try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true))) {
               Scanner scanner = new Scanner(System.in);
               System.out.println(":::::Add a new record:::::");
               System.out.print("Enter Name,Age,Major : ");
               String record = scanner.nextLine();
               writer.write(record + "\n");
          } catch (IOException e) {
               System.out.println("Error writing to file: " + e.getMessage());
          }
     }

     private static void searchEmployee() {
          try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
               Scanner scanner = new Scanner(System.in);
               System.out.println(":::::Search for an employee by name:::::");
               System.out.print("Enter Name : ");
               String search = scanner.nextLine().toLowerCase();

               String line;
               boolean found = false;
               while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].toLowerCase().contains(search)) {
                         System.out.println("Name: " + parts[0] + ", Age: " + parts[1] + ", Major: " + parts[2].trim());
                         found = true;
                    }
               }
               if (!found) {
                    System.out.println(search + " Not found");
               }
          } catch (IOException e) {
               System.out.println("Error reading file: " + e.getMessage());
          }
     }

     private static void updateEmployee() {
          try {
               ArrayList<String> employees = new ArrayList<>();
               Scanner scanner = new Scanner(System.in);

               System.out.println(":::::Update employee record:::::");
               System.out.print("Enter Name : ");
               String search = scanner.nextLine().toLowerCase();

               // Read all employees
               BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
               String line;
               boolean found = false;

               while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].toLowerCase().contains(search) && !found) {
                         System.out.println("Name: " + parts[0] + ", Age: " + parts[1] + ", Major: " + parts[2].trim());
                         System.out.print("Enter Name,Age,Major : ");
                         String newRecord = scanner.nextLine();
                         employees.add(newRecord);
                         found = true;
          
                    } else {
                         employees.add(line);
                    }
               }
               reader.close();

               if (!found) {
                    System.out.println(search + " Not found");
                    return;
               }

               // Write back all employees
               BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"));
               for (String emp : employees) {
                    writer.write(emp + "\n");
               }
               writer.close();

          } catch (IOException e) {
               System.out.println("Error updating file: " + e.getMessage());
          }
     }
}
