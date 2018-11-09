package aufgabe3;

public class Student extends Person {
    public Student(int geburtsjahr, String name) throws UngueltigesGeburtsdatumException, UngueltigerNameException {
        super(geburtsjahr, name);
    }

    public String getPersonenDaten() {
        return String.format("Student %s ist %d Jahre alt.", this.getName(), this.getAlter());
    }
}
