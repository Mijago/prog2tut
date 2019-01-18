public class FalscheIBANException extends Exception {
    public String description;

    FalscheIBANException(String message) {
        description = message;
    }

    FalscheIBANException() {
        this("FEHLER: Datei enthält ungültige IBAN");
    }
}
