package O2gether.personality;

public class SciencePersonality extends AbstractPersonality {
    private final String[] selectedRoles;

    public SciencePersonality(String[] roles) { 
        this.selectedRoles = roles;
    }
    @Override
    public String[] getAvailableRoles() { 
        return selectedRoles; 
    }
}
