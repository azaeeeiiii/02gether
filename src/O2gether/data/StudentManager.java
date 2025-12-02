package O2gether.data;

import O2gether.personality.Student;
import java.util.*;

public class StudentManager {
    private final StudentRegistry registry;
    private final StudentInputHandler handler;

    public StudentManager() {
        registry = new StudentRegistry();
        handler = new StudentInputHandler();
    }

    // Register Students
    public void registerStudent(Scanner sc) {
        if (registry.isFull()) {
            System.out.println("System full! Cannot register more students.");
            return;
        }
        
        System.out.println("\n[Press 'C' to cancel anywhere]");
        System.out.print("Please enter the number of students you want to register: ");
        String raw = sc.nextLine().trim();
        // allow user to cancel with 'C'
        if (raw.equalsIgnoreCase("C")) return;

        int n;
        try {
            n = Integer.parseInt(raw);
            if (n <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            // treat invalid input as a cancel — just return to menu silently
            return;
        }

        handler.registerMultipleStudents(sc, n, registry);
    }

    // View All Students
    public void viewStudents() {
        registry.viewStudents();
    }

    // Update Student
    public void updateStudent(Scanner sc) {
        Student s = handler.srCodeUpdate(sc, registry);
        if (s == null) {
            return; 
        }

        // Name update (show format guidance)
        System.out.print("Enter the new full name or press 'Enter' to keep current (FN-MI-LN): ");
        String newName = sc.nextLine().trim();
        // allow letters, spaces, periods, apostrophes and hyphens like registration
        if (!newName.isEmpty() && newName.matches("[a-zA-Z .'-]+")) s.setName(newName);

        // Allow updating the SR-Code (format: 00-00000) — this comes before asking about retake
        while (true) {
            System.out.print("Enter new SR-Code or press 'Enter' to keep current (format: 00-00000): ");
            String newCode = sc.nextLine().trim();
            if (newCode.isEmpty()){
                break; // keep current
            }

            if (!newCode.matches("\\d{2}-\\d{5}")) {
                System.out.println("Invalid format. Example: 24-08440");
                continue;
            }
            Student found = registry.findByCode(newCode);
            if (found != null && found != s) {
                System.out.println("That SR-Code already exists for another student. Please provide a unique SR-Code.");
                continue;
            }
            s.setSrCode(newCode);
            break;
        }

        // Ask whether to retake the personality test (no 'C' option to cancel update)
        while (true) {
            System.out.print("Do you want to retake the personality test? (Y/N): ");
            String ans = sc.nextLine().trim();
            if (ans.equalsIgnoreCase("Y")) {
                boolean completed = handler.askPersonalityTest(sc, s);
                if (!completed) {
                    System.out.println("Personality retake cancelled. Keeping previous personality values.");
                }
                break;
            }
            if (ans.equalsIgnoreCase("N") || ans.isEmpty()) {
                break;
            }
            System.out.println("Please answer Y(yes) or N(no).");
        }

        System.out.println("\nStudent updated successfully!");
    }

    // Delete Student
    public void deleteStudent(Scanner sc) {
        System.out.print("\n[Press 'C' to cancel anywhere]");
        System.out.print("\nEnter SR-Code to delete: ");
        String code = sc.nextLine().trim();
        if (code.equalsIgnoreCase("C")) 
            return;

        if (registry.removeStudentByCode(code)) System.out.println("Student deleted successfully.");
        else System.out.println("Student not found.");
    }

    // Form Groups
    public void formGroups(Scanner sc) {
        GroupBuilder.formGroups(sc, registry);
    }

    // Load preselected students
    public void loadPreselectedStudents() {
        registry.loadPreselectedStudents();
    }

}
