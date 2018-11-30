package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Haus implements Comparable<Haus>, Iterable<Raum> {
    List<Raum> raeume = new ArrayList<>();

    public Haus addRaum(Raum r) {
        this.raeume.add(r);
        return this;
    }

    public int getQuadratmeter() {
        int qm = 0;
        for (Raum raum : raeume) {
            qm += raum.getGroesse();
        }

        // Macht genau das gleiche, nur mit Iteratoren:
        /*
        Iterator<Raum> iterator = raeume.iterator();
        while (iterator.hasNext()) {
            qm += iterator.next().getGroesse();
        }
        */

        return qm;
    }

    @Override
    public int compareTo(Haus o) {
        return this.getQuadratmeter() - o.getQuadratmeter();
    }

    @Override
    public Iterator<Raum> iterator() {
        return new Iterator<Raum>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < raeume.size();
            }

            @Override
            public Raum next() {
                return raeume.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        String result = "";

        for (Raum r : this) {
            result += r.toString() + "\n";
        }

        return result;
    }
}
