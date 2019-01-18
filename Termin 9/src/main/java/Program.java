import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws FalscheIBANException {
        Program program = new Program();
        //program.ibanAusDateiLesen("C:\\Users\\Mi\\IdeaProjects\\prog2tut-ws1819\\Termin 9\\test.txt");

        program.dateienTest(new String[]{
                "C:\\Users\\Mi\\IdeaProjects\\prog2tut-ws1819\\Termin 9\\test.txt",
                "ASDF"
        });
    }

    public void dateienTest(String[] dateinamen) {
        for (String pfad : dateinamen) {
            try {
                ibanAusDateiLesen(pfad);
            } catch (FalscheIBANException e) {
                System.out.println("Datei " + pfad + " enthält (mindestens) eine fehlerhafte IBAN");
            }
        }
    }

    void ibanAusDateiLesen(String filename) throws FalscheIBANException {

        // TryWithResources
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                if (ibanCheck(line)) {
                    System.out.println(line + " ist eine korrekte IBAN!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei " + filename + " nicht gefunden");
        } catch (IOException e) {
            System.out.println("Fehler beim Lesevorgang von Datei: " + filename);
        } catch (NullPointerException e) {
            System.out.println("Datei " + filename + " existiert nicht");
        }
    }


    boolean ibanCheck(String iban) throws FalscheIBANException {
        if (iban.length() != 22) {
            throw new FalscheIBANException();
        }

        // Prüfe den ersten und zweiten Charakter
        if (iban.charAt(0) < 'A'
                || iban.charAt(0) > 'Z'
                || iban.charAt(1) < 'A'
                || iban.charAt(1) > 'Z') {
            throw new FalscheIBANException();
        }

        // Alternativ:
        // if (!iban.matches("^[A-Z]{2}.{20}$"))
        //    throw new FalscheIBANException();

        return true;
    }
}
