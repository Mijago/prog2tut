
import java.io.*;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {
        example_using_caesarwriter();
        example_using_b2breader();
    }

    private static void example_using_caesarwriter() {
        // Write it to a file
        try (BufferedWriter br = new BufferedWriter(new CaesarWriter(new FileWriter("out1.txt"), 5))) {
            br.write("Hallo");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // and some to the console...
        try (BufferedWriter br = new BufferedWriter(new CaesarWriter(new OutputStreamWriter(System.out), 10))) {
            br.write("Dies ist eine sehr geheime Nachricht!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void example_using_b2breader() {

    }
}