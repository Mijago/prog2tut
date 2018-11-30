package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Haus> haeuser = new ArrayList<>();
        Haus haus1 = new Haus().addRaum(new Raum("I.3.19", 10))
                .addRaum(new Raum("I.3.20", 20))
                .addRaum(new Raum("I.3.21", 15));

        Haus haus2 = new Haus().addRaum(new Raum("H.1.1", 50))
                .addRaum(new Raum("H.1.7", 20))
                .addRaum(new Raum("H.1.11", 20));

        haeuser.add(haus2);
        haeuser.add(haus1);

        Collections.sort(haeuser);

        for (Haus haus : haeuser) {
            System.out.println(haus);
        }


        for (Raum r : haus1) {
            System.out.println(r.getBezeichnung());
        }
    }
}
