package aufgabe2;

public class Dozent extends Person implements Gehaltsempfaenger {
    private int gehalt = 100;

    public int monatlichesGehalt() {
        return gehalt;
    }

    public String getPersonenDaten() {
        return String.format("Dozent %s ist %d Jahre alt und erhält %d €.", this.getName(), this.getAlter(), this.monatlichesGehalt());
    }
}
