import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Erstellen einer Liste von Nutzern
        List<User> users = new ArrayList<>();
        users.add(new User("ralf", "pw1"));
        users.add(new User("bernd", "pw2"));
        users.add(new User("wolfgang", "pw3"));

        // Serialisieren der Liste
        UserManager userManager = new UserManager();
        userManager.serialize(users);

        // Deserialisieren der Liste
        List<User> neueListe = userManager.deserialize();
        for (User user : neueListe) {
            System.out.println(user);
        }

        /*
        // Text in eine Datei schreiben mit OutputStreamWriter
        FileOutputStream fos = new FileOutputStream("test.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("Hello World");

        // Text in eine Datei schreiben mit FileWriter
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello World");
        */
    }
}
