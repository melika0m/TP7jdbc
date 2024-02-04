package classes;
import java.math.BigDecimal;

public class Note {
    
    private int noteID;
    private BigDecimal value;
    private int etudiantID;
    private int matiereID;
    private int enseignantID;
    
    // Default constructor
    Note() {}
    
    // Parameterized constructor
    public Note(int noteID, BigDecimal value, int etudiantID, int matiereID, int enseignantID) {
        this.noteID = noteID;
        this.value = value;
        this.etudiantID = etudiantID;
        this.matiereID = matiereID;
        this.enseignantID = enseignantID;
    }
    
    // Getters
    public int getNoteID() { return noteID; }
    public BigDecimal getValue() { return value; }
    public int getEtudiantID() { return etudiantID; }
    public int getMatiereID() { return matiereID; }
    public int getEnseignantID() { return enseignantID; }
    
    // Setters
    public void setNoteID(int noteID) { this.noteID = noteID; }
    public void setValue(BigDecimal value) { this.value = value; }
    public void setEtudiantID(int etudiantID) { this.etudiantID = etudiantID; }
    public void setMatiereID(int matiereID) { this.matiereID = matiereID; }
    public void setEnseignantID(int enseignantID) { this.enseignantID = enseignantID; }
    
    // Optional: Override toString method for better object representation
    @Override
    public String toString() {
        return "Note{" +
                "noteID=" + noteID +
                ", value=" + value +
                ", etudiantID=" + etudiantID +
                ", matiereID=" + matiereID +
                ", enseignantID=" + enseignantID +
                '}';
    }
}
