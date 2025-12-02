package O2gether.personality;

public class ProgrammingPersonality extends AbstractPersonality {
    private final String[] selectedRoles;

    public ProgrammingPersonality(String[] roles) { 
        this.selectedRoles = roles;
    }

    @Override
    public String[] getAvailableRoles() { 
        return selectedRoles; 
    }
}
