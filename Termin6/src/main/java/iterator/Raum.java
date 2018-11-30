package iterator;

public class Raum {
    private String bezeichnung;
    private int groesse;

    public Raum(String bezeichnung, int groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    @Override
    public String toString() {
        return "Raum{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", groesse=" + groesse +
                '}';
    }
}
