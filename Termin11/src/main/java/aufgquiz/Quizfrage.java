package aufgquiz;

public abstract class Quizfrage {
    private String frage;

    public Quizfrage(String frage) {
        this.frage = frage;
    }

    public String generiereFrage() {
        return frage + "\n\n" + generiereAntwort() + "\n";
    }

    public abstract String generiereAntwort();

}
