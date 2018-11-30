package maumau;

import java.util.Objects;

public class Karte {
    Farbe farbe;
    KartenTyp name;

    public Karte(Farbe farbe, KartenTyp name) {
        this.farbe = farbe;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Karte{" +
                "farbe=" + farbe +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Karte karte = (Karte) o;
        return farbe == karte.farbe &&
                name == karte.name;
    }

    @Override
    public int hashCode() {
        // Hash hängt von den Attributen ab!
        return Objects.hash(farbe, name);
    }
}
