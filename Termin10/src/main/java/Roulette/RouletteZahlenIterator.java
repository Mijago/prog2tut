package Roulette;

import java.util.ArrayList;
import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {
    private int zeroCount = 0;

    @Override
    public boolean hasNext() {
        return zeroCount < 3;
    }

    @Override
    public Integer next() {
        int randomNumber = (int) (Math.random() * 37);
        if (randomNumber == 0)
            zeroCount++;
        else
            zeroCount = 0;
        return randomNumber;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
