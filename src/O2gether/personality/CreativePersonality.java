package O2gether.personality;

public class CreativePersonality extends AbstractPersonality {
    private final String[] selectedRoles;

    public CreativePersonality(String[] roles) { 
        this.selectedRoles = roles; 
    }
    
    @Override
    public String[] getAvailableRoles() { 
        return selectedRoles; 
    }
}
