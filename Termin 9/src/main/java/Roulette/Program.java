package Roulette;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        // A
        RouletteZahlen rz = new RouletteZahlen();
        Iterator<Integer> iterator = rz.iterator();

        // iterator.hasNext() --> We want to stop if the iterator is terminated
        for (int n = 0; n < 10 && iterator.hasNext(); n++) {
            System.out.println(iterator.next());
        }

        // B
        Iterator<Integer> iteratorB = new RouletteZahlenIterator();

        // iterator.hasNext() --> We want to stop if the iterator is terminated
        for (int n = 0; n < 10 && iteratorB.hasNext(); n++) {
            System.out.println(iteratorB.next());
        }
    }
}
