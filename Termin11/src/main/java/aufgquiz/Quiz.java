package aufgquiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Quizfrage> fragen = new ArrayList<>();

    // Beispiel
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addFrage(new TextQuizFrage("Frage 1"))
            .addFrage(new TextQuizFrage("Frage 2"))
            .addFrage(new TextQuizFrage("Frage 3"))
            .addFrage(new MultipleChoiceQuizfrage("Frage 4", "Antwort A", "Antwort B", "Antwort C", "Antwort D"))
            .generate();
    }

    public Quiz addFrage(Quizfrage frage) {
        fragen.add(frage);
        return this;
    }

    public void generate() {
        for (Quizfrage quizfrage : fragen) {
            System.out.println(quizfrage.generiereFrage() + "\n");
        }
    }
}
