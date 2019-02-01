package aufgquiz;

public class MultipleChoiceQuizfrage extends Quizfrage {
    private String antwortA;
    private String antwortB;
    private String antwortC;
    private String antwortD;


    public MultipleChoiceQuizfrage(String frage, String antwortA, String antwortB, String antwortC, String antwortD) {
        super(frage);
        this.antwortA = antwortA;
        this.antwortB = antwortB;
        this.antwortC = antwortC;
        this.antwortD = antwortD;
    }

    @Override
    public String generiereAntwort() {
        return "Antwortmöglichkeiten:\n"
                + "A: " + antwortA + "\n"
                + "B: " + antwortB + "\n"
                + "C: " + antwortC + "\n"
                + "D: " + antwortD;
    }
}
