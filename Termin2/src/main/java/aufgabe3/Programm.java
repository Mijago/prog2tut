package aufgabe3;

public class Programm {
    public static void main(String[] args) {
        GehaltsempfaengerVerwaltung verwaltung = new GehaltsempfaengerVerwaltung();

        try {
            verwaltung.addGehaltssempfaenger(new Tutor(1997, "Hallo"));
            verwaltung.addGehaltssempfaenger(new Dozent(1977, "Peter"));
            verwaltung.addGehaltssempfaenger(new Hausmeister(1967, "Peter"));
            // Wirft GehaltsempfaengerVerwaltungVollException
            verwaltung.addGehaltssempfaenger(new Hausmeister(1980, "Peter"));

            verwaltung.printGehaltssempfaenger();
        } catch (UngueltigerNameException e) {
            System.out.println(e.getMessage());
        } catch (UngueltigesGeburtsdatumException e) {
            System.out.println(e.getMessage());
        }
    }
}
