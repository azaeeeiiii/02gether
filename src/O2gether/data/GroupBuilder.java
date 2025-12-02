package O2gether.data;
import O2gether.personality.Student;
import java.util.*;

public class GroupBuilder {

    public static void formGroups(Scanner sc, StudentRegistry registry) {
        if (registry.getCount() == 0) {
            System.out.println("No students to group.");
            return;
        }

        String projectChoice = selectProjectChoice(sc);
        if (projectChoice == null){
            return;
        }

        String subChoice = selectSubChoice(sc, projectChoice);
        if (subChoice == null) {
            // user cancelled while selecting sub-type
            return;
        }

        int numGroups = askNumGroups(sc, registry.getCount());
        if (numGroups == -1){ 
            return;
        }

        List<Student> shuffled = prepareShuffledList(registry);
        assignRolesToGroups(shuffled, numGroups, projectChoice, subChoice);
    }

    private static String selectProjectChoice(Scanner sc) {
        System.out.println();
        System.out.println("[Press 'C' to cancel anywhere]");
        System.out.println("Select Project Type:");
        System.out.println("1. Programming");
        System.out.println("2. Research");
        System.out.println("3. Video Presentation");
        System.out.println("4. Performing Arts");
        System.out.println("5. Visual Arts");
        System.out.print("Your choice: ");
        String projectChoice = sc.nextLine().trim();
        if (projectChoice.equalsIgnoreCase("C")) {
            System.out.println("Cancelled. Returning to menu..");
            return null;
        }
        return projectChoice;
    }

    private static String selectSubChoice(Scanner sc, String projectChoice) {
        String subChoice = "";
        if (projectChoice == null) return null;

        if (projectChoice.equals("2")) {
            System.out.print("Select sub-project (1. Science / 2. Literature): ");
            subChoice = sc.nextLine().trim();
            if (subChoice.equalsIgnoreCase("C")) {
                System.out.println("Cancelled. Returning to menu..");
                return null;
            }
        } else if (projectChoice.equals("3")) {
            System.out.print("Select sub-project (1. Creative / 2. Literature): ");
            subChoice = sc.nextLine().trim();
            if (subChoice.equalsIgnoreCase("C")) {
                System.out.println("Cancelled. Returning to menu..");
                return null;
            }
        }
        return subChoice;
    }

    private static int askNumGroups(Scanner sc, int totalStudents) {
        System.out.print("Enter the desired number of groups: ");
        String input = sc.nextLine().trim();
        if (input.equalsIgnoreCase("C")) {
            System.out.println("Cancelled — returning to menu.");
            return -1;
        }

        int numGroups;
        try {
            numGroups = Integer.parseInt(input);
            if (numGroups <= 0) throw new NumberFormatException();
            if (totalStudents / numGroups <= 1) {
            System.out.println("Too many groups! Each group would have only 1 member or fewer. Cancelled.");
            return -1;
        }
        } catch (NumberFormatException e) {
            // treat invalid input as a cancel for the group flow
            System.out.println("Cancelled — returning to menu.");
            return -1;
        }
        return numGroups;
    }

    private static List<Student> prepareShuffledList(StudentRegistry registry) {
        List<Student> shuffled = registry.getStudentsList();
        Collections.shuffle(shuffled);
        return shuffled;
    }

    private static void assignRolesToGroups(List<Student> shuffled, int numGroups, String projectChoice, String subChoice) {
        int total = shuffled.size();
        if (total == 0){
            return;
        }

        int studentsPerGroup = total / numGroups;
        int extra = total % numGroups;
        int index = 0;

        for (int g = 0; g < numGroups; g++) {
            int currentGroupSize = studentsPerGroup + (g < extra ? 1 : 0);
            System.out.println("\n--- Group " + (g + 1) + " ---");

            Set<String> usedRoles = new HashSet<>(); 
            for (int i = 0; i < currentGroupSize && index < total; i++, index++) {
                Student s = shuffled.get(index);
                String role = "No Role Selected";

                List<String> chosenRolesForProject = getChosenRolesForProject(s, projectChoice, subChoice);

                if (!chosenRolesForProject.isEmpty()) {
                    for (String r : chosenRolesForProject) {
                        if (!usedRoles.contains(r)) {
                            role = r;
                            usedRoles.add(r);
                            break;
                        }
                    }
                    if (role.equals("No Role Selected")) role = chosenRolesForProject.get(0);
                }

                System.out.println(s.getName() + " (" + s.getSrCode() + ") - " + role);
            }
        }
    }

    private static List<String> getChosenRolesForProject(Student s, String projectChoice, String subChoice) {
        List<String> chosenRolesForProject = new ArrayList<>();
        String[] selectedRaw = null;

        // Use the personality objects (polymorphism) to obtain selected roles.
        // This avoids directly querying arrays and demonstrates runtime binding.
        switch (projectChoice) {
        case "1":
            if (s.getProgrammingPersonality() != null) {
                selectedRaw = s.getProgrammingPersonality().getAvailableRoles();
            }
            break;
        case "2":
            if (subChoice != null && subChoice.equals("1")) {
                if (s.getSciencePersonality() != null) selectedRaw = s.getSciencePersonality().getAvailableRoles();
            } else {
                if (s.getLiteraturePersonality() != null) selectedRaw = s.getLiteraturePersonality().getAvailableRoles();
            }
            break;
        case "3":
            if (subChoice != null && subChoice.equals("1")) {
                if (s.getCreativePersonality() != null) selectedRaw = s.getCreativePersonality().getAvailableRoles();
            } else {
                if (s.getLiteraturePersonality() != null) selectedRaw = s.getLiteraturePersonality().getAvailableRoles();
            }
            break;
        case "4":
            if (s.getCreativePersonality() != null){
                selectedRaw = s.getCreativePersonality().getAvailableRoles();
            }
            break;
        case "5":
            if (s.getCreativePersonality() != null){
                selectedRaw = s.getCreativePersonality().getAvailableRoles();
            }
            break;
        default:
            // optional: handle unexpected input
            selectedRaw = null;
            break;
        }


        if (selectedRaw != null) {
            for (String entry : selectedRaw) {
                if (entry == null) {
                    continue;
                }
                String[] parts = entry.split(",");
                for (String p : parts) {
                    String t = p.trim();
                    if (!t.isEmpty() && !chosenRolesForProject.contains(t)){
                        chosenRolesForProject.add(t);
                    }
                }
            }
        }

        return chosenRolesForProject;
    }
}
