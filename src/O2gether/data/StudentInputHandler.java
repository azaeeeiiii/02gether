package O2gether.data;

import O2gether.personality.Student;
import java.util.*;

public class StudentInputHandler{

    // Register a number of students using the registry
    public boolean registerMultipleStudents(Scanner sc, int n, StudentRegistry registry) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nRegister Student " + (i + 1) + ": ");
            if (registry.isFull()) {
                System.out.println("Capacity reached while registering. Stopping.");
                return false;
            }

            boolean added = registerSingleStudent(sc, registry);
            if (added) {
                System.out.println("Student registered successfully!");
            }
            else System.out.println("Registration cancelled for this entry.");
        }
        return true;
    }

    // Register a single student and add to registry
    public boolean registerSingleStudent(Scanner sc, StudentRegistry registry) {
        String name = inputName(sc);
        if (name == null) {
            return false;
        }

        String sr = inputSrCode(sc, registry);
        if (sr == null) {
            return false;
        }

        Student s = new Student(name, sr);
        boolean completed = askPersonalityTest(sc, s);
        if (!completed) {
            // user cancelled during personality test for this student
            return false;
        }
        return registry.addStudent(s);
    }

    // Input
    public String inputName(Scanner sc) {
        while (true) {
            System.out.print("Enter the student's full name (FN-MI-LN): ");
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("C")) {
                return null;
            }
            if (name.matches("[a-zA-Z .'-]+")) {
                return name; 
            }
            System.out.println("Invalid name. Use letters only.");
        }
    }

    public String inputSrCode(Scanner sc, StudentRegistry registry) {
        while (true) {
            System.out.print("Enter the student's SR-Code (format: 00-00000): ");
            String sr = sc.nextLine().trim();
            if (sr.equalsIgnoreCase("C")) 
                return null;
            if (!sr.matches("\\d{2}-\\d{5}")) {
                System.out.println("Invalid format. Example: 24-08440");
                continue;
            }
            if (registry.findByCode(sr) != null) {
                System.out.println("The SR-Code entered already exists. Please enter a unique SR Code.");
                continue;
            }
            return sr;
        }
    }

    public Student srCodeUpdate(Scanner sc, StudentRegistry registry) {
        System.out.print("\n[Press 'C' to cancel anywhere]");
        System.out.print("\nPlease enter the SR-Code: ");
        String code = sc.nextLine().trim();
        if (code.equalsIgnoreCase("C")){ 
            return null;
        }

        Student s = registry.findByCode(code);
        if (s == null) System.out.println("Student is not found.");
            return s;
    }

    // Personality Test
    // Returns true when personality test completed, false when user pressed 'C' to cancel
    public boolean askPersonalityTest(Scanner sc, Student s) {
        System.out.println("\n=== Personality Test ===");
        System.out.println("[Press 'C' to cancel and skip this student]");

        String[] science = selectRolesValidated(sc, s.getScienceRoles(), "Science");
        if (science == null) {
            return false;
        }
        s.setScience(science);

        String[] creative = selectRolesValidated(sc, s.getCreativeRoles(), "Creative");
        if (creative == null){ 
            return false;
        }
        s.setCreative(creative);

        String[] literature = selectRolesValidated(sc, s.getLiteratureRoles(), "Literature");
        if (literature == null){
             return false;
        }
        s.setLiterature(literature);

        String[] programming = selectRolesValidated(sc, s.getProgrammingRoles(), "Programming");
        if (programming == null){
             return false;
        }
        s.setProgramming(programming);

        return true;
    }

    private String[] selectRolesValidated(Scanner sc, String[] roles, String projectName) {
        while (true) {
            System.out.println("\nIn a " + projectName + " Project, which roles do you identify with? (Select comma-separated numbers)");
            printOptions(roles);
            System.out.print("Your choices: ");

            String line = sc.nextLine().trim();
            // allow user to cancel the personality test for this student
            if (line.equalsIgnoreCase("C")) {
                System.out.println("Personality test cancelled for this student.");
                return null; // signal cancel
            }
            if (line.isEmpty()) {
                System.out.println("You must select at least one role or press 'C' to cancel the personality test for this student.");
                continue;
            }

            String[] idx = line.split(",");
            List<String> chosen = new ArrayList<>();
            boolean valid = true;

            for (String i : idx) {
                try {
                    int n = Integer.parseInt(i.trim());
                    if (n > 0 && n <= roles.length) {
                        chosen.add(roles[n - 1].trim());
                    } else {
                        System.out.println("Invalid number: " + i);
                        valid = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: " + i);
                    valid = false;
                    break;
                }
            }

            if (valid){
                return chosen.toArray(String[]::new);
            }
            System.out.println("Please try again.");
        }
    }

    private void printOptions(String[] roles) {
        for (int i = 0; i < roles.length; i++) {
            System.out.println((i + 1) + ". " + roles[i].trim());
        }
    }
}
