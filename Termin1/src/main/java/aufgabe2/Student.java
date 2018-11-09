package aufgabe2;

public class Student extends Person {
    public String getPersonenDaten() {
        return String.format("Student %s ist %d Jahre alt.", this.getName(), this.getAlter());
    }
}
