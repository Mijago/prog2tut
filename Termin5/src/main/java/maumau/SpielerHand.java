package maumau;

import java.util.LinkedList;
import java.util.List;

public class SpielerHand {
    List<Karte> hand = new LinkedList<>();

    public void addKarte(Karte k) throws IllegalArgumentException {
        if (hand.contains(k)) {
            throw new IllegalArgumentException("Karte bereits vorhanden!");
        }

        hand.add(k);
        System.out.println("Karte " + k + " hinzugefügt!");
    }

    public int getSize() {
        return hand.size();
    }

    public boolean contains(Karte k) {
        return hand.contains(k);
    }

}
