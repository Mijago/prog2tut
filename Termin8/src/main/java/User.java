import java.io.Serializable;

public class User implements Serializable, Comparable<User> {
    private final String benutzename;
    private final transient String passwort;

    User(String name, String pw) {
        benutzename = name;
        passwort = pw;
    }

    public String getBenutzename() {
        return benutzename;
    }

    @Override
    public int compareTo(User u) {
        /*
         * Arbeitsweise von compareTo:
         * < 0 wenn this(Person) vor o(Person) in der Liste sein soll
         * = 0 wenn der Wert gleich ist
         * > 0 wenn this(Person) nach o(Person) in der Liste sein soll
         */
        return this.benutzename.compareTo(u.benutzename);
    }

    @Override
    public String toString() {
        return "User{" +
                "benutzename='" + benutzename + '\'' +
                ", passwort='" + passwort + '\'' +
                '}';
    }
}
