package ExamUeb;

public class Question {

    String text; //Fragentext

    //Wandelt eine eingelesene Zeile in ein Question-Objekt um
    public static Question toQuestion(String line) {
        Question question = new Question();
        question.text = line;
        return question;
    }
}