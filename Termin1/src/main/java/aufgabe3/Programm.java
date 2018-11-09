package aufgabe3;

public class Programm {
    public static void main(String[] args) {
        GehaltsempfaengerVerwaltung verwaltung = new GehaltsempfaengerVerwaltung();
        verwaltung.addGehaltssempfaenger(new Tutor(1997, "Horst"));
        verwaltung.addGehaltssempfaenger(new Dozent(1977, "Peter"));
        verwaltung.addGehaltssempfaenger(new Hausmeister(1967, "Peter"));

        verwaltung.printGehaltssempfaenger();
    }
}
