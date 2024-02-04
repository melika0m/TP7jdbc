package classes;

public class Etudiant {
    
    private int etudiantID;
    private String name;
    private int filiereID; // Foreign key to Filiere
    
    // Default constructor
    Etudiant() {}
    
    // Parameterized constructor
    public Etudiant(int etudiantID, String name, int filiereID) {
        this.etudiantID = etudiantID;
        this.name = name;
        this.filiereID = filiereID;
    }
    
    // Getters
    public int getEtudiantID() { return etudiantID; }
    public String getName() { return name; }
    public int getFiliereID() { return filiereID; }
    
    // Setters
    public void setEtudiantID(int etudiantID) { this.etudiantID = etudiantID; }
    public void setName(String name) { this.name = name; }
    public void setFiliereID(int filiereID) { this.filiereID = filiereID; }
    
    // Optional: Override toString method for better object representation
    @Override
    public String toString() {
        return "Etudiant{" +
                "etudiantID=" + etudiantID +
                ", name='" + name + '\'' +
                ", filiereID=" + filiereID +
                '}';
    }
}
