import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserManagerTest {


    @Test
    public void testStream() throws IOException {
        BufferedWriter fos = new BufferedWriter(new FileWriter("test.txt"));
        fos.write("asd");
        fos.close();

        assertTrue(Files.exists(Paths.get("test.txt")));

    }

    @Test
    public void testUserManager() {
        List<User> users = new ArrayList<>();
        users.add(new User("ralf", "pw1"));
        users.add(new User("bernd", "pw2"));
        users.add(new User("wolfgang", "pw3"));

        // Serialisieren der Liste
        UserManager userManager = new UserManager();
        userManager.serialize(users);

        List<User> deserializedUser = userManager.deserialize();

        for (int i = 0; i < deserializedUser.size(); i++) {
            User userA = deserializedUser.get(i);
            User userB = users.get(i);
            assertEquals(userA.getBenutzename(), userB.getBenutzename());
        }
    }


}