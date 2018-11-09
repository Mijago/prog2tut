package aufgabe2;

public class Tutor extends Student implements Gehaltsempfaenger {
    private int gehalt = 40;

    public int monatlichesGehalt() {
        return gehalt;
    }

    @Override
    public String getPersonenDaten() {
        return String.format("Tutor %s ist %d Jahre alt und erhält %d €.", this.getName(), this.getAlter(), monatlichesGehalt());
    }
}
