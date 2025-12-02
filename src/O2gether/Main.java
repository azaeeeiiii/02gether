package O2gether;

import O2gether.data.StudentManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StudentManager manager = new StudentManager();

            // Load default predefined students
            manager.loadPreselectedStudents();

            boolean running = true;
                System.out.println("\n      Welcome to 02gether!  ");
                System.out.println("Your student grouping assistant! ");

            while (running) {
                System.out.println("\n-------------------------------");
                System.out.println("           Main Menu");
                System.out.println("-------------------------------");
                System.out.println("1. Register Students");
                System.out.println("2. View Students");
                System.out.println("3. Update Information");
                System.out.println("4. Form Groups");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.println("-------------------------------");
                System.out.print("Choose option: ");
                String choice = sc.nextLine();


                switch (choice) {
                case "1":
                    manager.registerStudent(sc);
                    break;
                case "2":
                    manager.viewStudents();
                    break;
                case "3":
                    manager.updateStudent(sc);
                    break;
                case "4":
                    manager.formGroups(sc);
                    break;
                case "5":
                    manager.deleteStudent(sc);
                    break;
                case "6":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
                }
            }
            System.out.println("\nThank you for using 02gether!");
            System.out.println("  Collaboration starts here.");
            System.out.println("         Goodbye!");
        }
    }
}
