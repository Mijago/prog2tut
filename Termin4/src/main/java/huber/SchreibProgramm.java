package huber;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SchreibProgramm {
    public static void main(String[] args) {
        Auto[] autos = {
            new Auto(12, 1998, "Porsche", "911", "WÜ AB 12"),
            new Auto(30, 1998, "Porsche", "Cayene", "WÜ AB 13"),
            new Auto(50, 1998, "Porsche", "Panamera", "WÜ AB 14"),
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("autos.txt"))) {
            for (Auto auto: autos) {
                oos.writeObject(auto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
