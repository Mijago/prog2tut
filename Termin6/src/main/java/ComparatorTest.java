import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Person> personenListe = new ArrayList<Person>();
        personenListe.add(new Person(20));
        personenListe.add(new Person(30));
        personenListe.add(new Person(10));
        personenListe.add(new Person(20));


        Collections.sort(personenListe);

        Collections.sort(personenListe, (o1, o2) -> o1.alter - o2.alter);

        Collections.sort(personenListe, new PersonComparator());

        Collections.sort(personenListe, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.alter - o2.alter;
            }
        });
    }

    public static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.alter - o2.alter;
        }
    }

    public static class Person implements Comparable<Person> {
        public int alter;

        public Person(int alter) {
            this.alter = alter;
        }

        public int compareTo(Person o) {
            return this.alter - o.alter;
        }
    }
}
