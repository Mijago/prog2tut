package aufgquiz;

public class TextQuizFrage extends Quizfrage {

    public TextQuizFrage(String frage) {
        super(frage);
    }

    @Override
    public String generiereAntwort() {
        return "Antwort:\n\n";
    }
}
