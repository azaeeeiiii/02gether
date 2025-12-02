package O2gether.personality;

public class LiteraturePersonality extends AbstractPersonality {
    private final String[] selectedRoles;

    public LiteraturePersonality(String[] roles) { 
        this.selectedRoles = roles; 
    }

    @Override
    public String[] getAvailableRoles() { 
        return selectedRoles; 
    }
}
