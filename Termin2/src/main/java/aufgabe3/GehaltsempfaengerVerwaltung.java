package aufgabe3;

public class GehaltsempfaengerVerwaltung {
    private Gehaltsempfaenger[] empfaenger = new Gehaltsempfaenger[3];
    int currentId = 0;

    public void addGehaltssempfaenger(Gehaltsempfaenger neuerEmpfaenger) {
        if (currentId >= 3) {
            throw new GehaltsempfaengerVerwaltungVollException();
        }

        this.empfaenger[currentId] = neuerEmpfaenger;
        currentId++;
    }

    public void printGehaltssempfaenger() {
        for (Gehaltsempfaenger gehaltsempfaenger : this.empfaenger) {
            System.out.println(gehaltsempfaenger.getPersonenDaten());
        }
    }
}
