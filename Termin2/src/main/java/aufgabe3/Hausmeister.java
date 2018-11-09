package aufgabe3;

public class Hausmeister extends Person implements Gehaltsempfaenger {
    private int gehalt = 50;

    public Hausmeister(int geburtsjahr, String name) throws UngueltigesGeburtsdatumException, UngueltigerNameException {
        super(geburtsjahr, name);
    }

    public int monatlichesGehalt() {
        return gehalt;
    }

    public String getPersonenDaten() {
        return String.format("Hausmeister %s ist %d Jahre alt und erhält %d €.", this.getName(), this.getAlter(), this.monatlichesGehalt());
    }
}
