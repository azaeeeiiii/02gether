package O2gether.personality;

import java.util.*;

public class Personality {
    private final Map<String, List<String>> projectRoles = new HashMap<>();

    private final Map<String, String[]> allRoles = Map.of(
        "Science", new String[]{"Researcher", "Experimenter", "Data Recorder",
                                            "Analyst", "Writer", "Presenter", "Designer"},
        "Creative", new String[]{"Scriptwriter","Actor","Video Editor","Graphic Designer",
                                    "Director","Videographer","Singer","Dancer"},
        "Literature", new String[]{"Literature Reviewer", "Data Collector", "Research Designer",
                                        "Concept Developer", "Academic Writer", "Editor", "Presenter"},
        "Programming", new String[]{"Programmer","Debugger","Documentation Writer","Researcher",
                                        "UI Designer","Concept Developer", "Project Organizer"});

    public void takeTest(Scanner sc) {
        for (String project : allRoles.keySet()) {
            System.out.println("\nIn " + project + " which roles do you identify with? (Select comma-separated numbers or press Enter to skip)");
            String[] roles = allRoles.get(project);

            for (int i = 0; i < roles.length; i++)
                System.out.println((i + 1) + ". " + roles[i]);

            System.out.print("Your choices: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("C")) {
                continue;
            }

            List<String> selected = new ArrayList<>();
            for (String idx : input.split(",")) {
                try {
                    int i = Integer.parseInt(idx.trim()) - 1;
                    if (i >= 0 && i < roles.length)selected.add(roles[i]);
                } catch (NumberFormatException ignored) {}
            }
            projectRoles.put(project, selected);
        }
    }

    public List<String> getRolesForProject(String project) {
        return projectRoles.getOrDefault(project, new ArrayList<>());
    }

}
