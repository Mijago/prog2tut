package aufgabe2;

import java.util.Date;

public abstract class Person implements HatPersonenDaten {
    private int geburtsjahr;
    private String name;

    public int getAlter() {
        return geburtsjahr - new Date().getYear();
    }

    public String getName() {
        return this.name;
    }
}
