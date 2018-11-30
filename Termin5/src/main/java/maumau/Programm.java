package maumau;

import java.util.Random;

public class Programm {
    public static void main(String[] args) {
        Karte herzBube = new Karte(Farbe.HERZ, KartenTyp.KARTE_BUBE);


        Random random = new Random();

        // Lösung 1: Mit Try-Catch
        SpielerHand hand = new SpielerHand();
        while (hand.getSize() < 5) {
            Farbe zufallsFarbe = Farbe.values()[random.nextInt(3)];
            KartenTyp zufallsTyp = KartenTyp.values()[random.nextInt(8)];
            try {
                hand.addKarte(new Karte(zufallsFarbe, zufallsTyp));
            }catch (Exception e) {
                // ignore
                System.out.println("GOT A DUPLICATE");
            }
        }

        System.out.println("-----------------------------");

        SpielerHand hand2 = new SpielerHand();
        while (hand2.getSize() < 5) {
            Farbe zufallsFarbe = Farbe.values()[random.nextInt(3)];
            KartenTyp zufallsTyp = KartenTyp.values()[random.nextInt(8)];
            Karte k = new Karte(zufallsFarbe, zufallsTyp);

            if (!hand2.contains(k))
                hand2.addKarte(k);
            else
                System.out.println("GOT A DUPLICATE");
        }


    }
}
