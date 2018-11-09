package aufgabe3;

import java.util.Date;

public abstract class Person implements HatPersonenDaten {
    private int geburtsjahr;
    private String name;

    public Person(int geburtsjahr, String name) throws UngueltigerNameException, UngueltigesGeburtsdatumException {
        if (name.length() == 0) {
            throw new UngueltigerNameException();
        }

        if (geburtsjahr > 2018) {
            throw new UngueltigesGeburtsdatumException();
        }


        this.geburtsjahr = geburtsjahr;
        this.name = name;
    }

    public int getAlter() {
        return geburtsjahr - new Date().getYear();
    }

    public String getName() {
        return this.name;
    }
}
