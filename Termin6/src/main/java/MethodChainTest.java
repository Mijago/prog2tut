public class MethodChainTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAlter(20);
        person.setGehalt(20000000);
        person.setName("Peter");

        Person person2 = new Person()
                .setAlter(20)
                .setGehalt(2000000)
                .setName("Peter");

        Person person3 = new PersonBuilder(20, "Peter").withGehalt(20000000).build();


        // Auch ohne "withGehalt"
        Person karl2 = new PersonBuilder(10, "Karl").build();
    }


    public static class PersonBuilder {
        private int alter;
        private String name;

        private int gehalt = 0;

        public PersonBuilder(int alter, String name) {
            this.alter = alter;
            this.name = name;
        }

        public PersonBuilder withGehalt(int newGehalt) {
            this.gehalt = newGehalt;
            return this;
        }

        public Person build() {
            Person p = new Person();
            p.setName(name)
                    .setAlter(alter)
                    .setGehalt(gehalt);

            return p;
        }
    }


    public static class Person {
        private int alter;
        private String name;
        private int gehalt;

        public int getAlter() {
            return alter;
        }

        public Person setAlter(int alter) {
            this.alter = alter;
            return this;
        }

        public String getName() {
            return name;
        }

        public Person setName(String name) {
            this.name = name;

            return this;
        }

        public int getGehalt() {
            return gehalt;
        }

        public Person setGehalt(int gehalt) {
            this.gehalt = gehalt;

            return this;
        }
    }

}
