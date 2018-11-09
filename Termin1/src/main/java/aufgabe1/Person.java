package aufgabe1;

import java.util.Calendar;
import java.util.Date;

public abstract class Person implements HatPersonenDaten {
    private int geburtsjahr;
    private String name;


    public Person(int geburtsjahr, String name) {
        this.geburtsjahr = geburtsjahr;
        this.name = name;
    }

    public int getAlter() {
        return geburtsjahr - Calendar.getInstance().get(Calendar.YEAR);
    }

    public String getName() {
        return this.name;
    }
}
