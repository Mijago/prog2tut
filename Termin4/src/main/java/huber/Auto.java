package huber;

import java.io.Serializable;

public class Auto implements Serializable {
    int PS;
    int Baujahr;
    String Marke;
    String Modell;

    transient String Kennzeichen;

    public Auto(int PS, int baujahr, String marke, String modell, String kennzeichen) {
        this.PS = PS;
        Baujahr = baujahr;
        Marke = marke;
        Modell = modell;
        Kennzeichen = kennzeichen;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "PS=" + PS +
                ", Baujahr=" + Baujahr +
                ", Marke='" + Marke + '\'' +
                ", Modell='" + Modell + '\'' +
                ", Kennzeichen='" + Kennzeichen + '\'' +
                '}';
    }
}
