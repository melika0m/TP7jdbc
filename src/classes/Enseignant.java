package classes;


public class Enseignant {
    
    private int enseignantID;
    private String name;
    
    // Default constructor
    Enseignant() {}
    
    // Parameterized constructor
    public Enseignant(int enseignantID, String name) {
        this.enseignantID = enseignantID;
        this.name = name;
    }
    
    // Getters
    public int getEnseignantID() { return enseignantID; }
    public String getName() { return name; }
    
    // Setters
    public void setEnseignantID(int enseignantID) { this.enseignantID = enseignantID; }
    public void setName(String name) { this.name = name; }
    
    // Optional: Override toString method for better object representation
    @Override
    public String toString() {
        return "Enseignant{" +
                "enseignantID=" + enseignantID +
                ", name='" + name + '\'' +
                '}';
    }
}

