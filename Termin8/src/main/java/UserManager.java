import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    @Override
    public void serialize(List<User> object) throws RuntimeException {
        // Serialisierung: ObjectOutputStream serialisiert ein Objekt und
        // gibt es an den dekorierten Stream (hier fos) als Byte-Array weiter.

        // Try with Resources -> Schließt die Streams automatisch
        try (FileOutputStream fos = new FileOutputStream("user.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Serialisierung des gesamten Listenobjekts
            oos.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> deserialize() {
        try (FileInputStream fis = new FileInputStream("user.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            // Deserialisierung des gesamten Listenobjekts
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
