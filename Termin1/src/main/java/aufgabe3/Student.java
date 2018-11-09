package aufgabe3;

public class Student extends Person {
    public Student(int geburtsjahr, String name) {
        super(geburtsjahr, name);
    }

    public String getPersonenDaten() {
        return String.format("Student %s ist %d Jahre alt.", this.getName(), this.getAlter());
    }
}
