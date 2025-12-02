package O2gether.personality;

import java.util.Arrays;

public class Student {
    private String name;
    private String srCode;

    // Selected roles
    private String[] creative, science, literature, programming;

    // Personality objects
    private AbstractPersonality sciencePersonality;
    private AbstractPersonality creativePersonality;
    private AbstractPersonality literaturePersonality;
    private AbstractPersonality programmingPersonality;
    

    // Role options
    private final String[] scienceRoles = {"Researcher", "Experimenter", "Data Recorder",
                                            "Analyst", "Writer", "Presenter", "Designer"};
    private final String[] creativeRoles = {"Scriptwriter","Actor","Video Editor","Graphic Designer",
                                            "Director","Videographer","Singer","Dancer"};
    private final String[] literatureRoles = {"Literature Reviewer", "Research Designer", "Concept Developer", "Academic Writer", "Editor", "Presenter"};
    private final String[] programmingRoles = {"Programmer","Debugger","Documentation Writer","Researcher",
                                                "UI Designer","Concept Developer","Project Organizer"};

    public Student(String name, String srCode) {
        this.name = name;
        this.srCode = srCode;
    }

    // Setters for selected roles
    public void setScience(String[] roles) { 
        science = roles; 
        sciencePersonality = new SciencePersonality(roles);
    }

    public void setCreative(String[] roles) { 
        creative = roles; 
        creativePersonality = new CreativePersonality(roles);
    }

    public void setLiterature(String[] roles) { 
        literature = roles; 
        literaturePersonality = new LiteraturePersonality(roles);
    }

    public void setProgramming(String[] roles) { 
        programming = roles; 
        programmingPersonality = new ProgrammingPersonality(roles);
    }

    // Getters for personality objects 
    public AbstractPersonality getSciencePersonality() { 
        return sciencePersonality; 
    }
    public AbstractPersonality getCreativePersonality() { 
        return creativePersonality; 
    }
    public AbstractPersonality getLiteraturePersonality() { 
        return literaturePersonality; 
    }
    public AbstractPersonality getProgrammingPersonality() { 
        return programmingPersonality; 
    }

    // Getters for selected roles (students' choices) 
    public String[] getSelectedScienceRoles() { 
        return science; 
    }
    public String[] getSelectedCreativeRoles() { 
        return creative; 
    }
    public String[] getSelectedLiteratureRoles() { 
        return literature; 
    }
    public String[] getSelectedProgrammingRoles() { 
        return programming; 
    }


    // Getters for role options 
    public String[] getScienceRoles() { 
        return scienceRoles; 
    }
    public String[] getCreativeRoles() { 
        return creativeRoles; 
    }
    public String[] getLiteratureRoles() { 
        return literatureRoles; 
    }
    public String[] getProgrammingRoles() { 
        return programmingRoles; 
    }

     
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public String getSrCode() { 
        return srCode; 
    }

    // Allow updating SR-Code when needed (e.g., during student update)
    public void setSrCode(String srCode) {
        this.srCode = srCode;
    }

    @Override
    public String toString() {
        return srCode + " - " + name + "\n" +
            "  Science Roles:     " + Arrays.toString(science) + "\n" +
            "  Creative Roles:    " + Arrays.toString(creative) + "\n" +
            "  Literature Roles:  " + Arrays.toString(literature) + "\n" +
            "  Programming Roles: " + Arrays.toString(programming);
    }
}
