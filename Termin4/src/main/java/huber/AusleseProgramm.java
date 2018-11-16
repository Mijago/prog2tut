package huber;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AusleseProgramm {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("autos.txt"))) {

            boolean endOfFile = false;

            while (!endOfFile) {
                try {
                    Object o = ois.readObject();
                    if (o instanceof Auto) {
                        Auto p = (Auto) o;
                        System.out.println(o);
                    }
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
