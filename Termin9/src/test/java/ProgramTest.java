import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ProgramTest {

    @Test
    public void testIbanCheck() throws FalscheIBANException {
        Program program = new Program();

        // Test1: Kann valide IBAN erkennen
        assertTrue(program.ibanCheck("DE12345678901234567890"));

        // Test2: Kann invalide IBAN erkennen (Exception wird geworfen)
        try {
            program.ibanCheck("12345");
            // Wenn wir hier ankommen, wurde keine Exception geworfen und die falsche
            // IBAN als richtige erkannt
            fail("Expected FalscheIBANException");
        } catch (FalscheIBANException e) {
            // Funktioniert wie gewollt
        }
    }
}
