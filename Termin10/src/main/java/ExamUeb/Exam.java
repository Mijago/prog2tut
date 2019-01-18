package ExamUeb;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Question> questions = new ArrayList<Question>();

    //Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
    String readHeaderFromFile() {
        return null; // TODO: Implement
    }

    // B
    void toTest() throws IOException {
        try (FileWriter fw = new FileWriter("test.tex")) {
            fw.write(readHeaderFromFile());

            for (Question question : questions) {
                fw.write("\\textbf{" + question.text + "}\\\\\n");
            }

            fw.write("\\end{document}");
        }
    }

    // A
    void readQuestions() throws IOException {
        /*
         * • die die Propagierung einer IOException angibt.
         */

        try (FileReader fr = new FileReader("questions.csv");
             BufferedReader br = new BufferedReader(fr)) {

            // • die die Datei questions.csv zeilenweise ausliest,
            String line;
            while ((line = br.readLine()) != null) {
                // • jede eingelesene Zeile an die Methode toQuestion der Klasse Question übergibt
                Question newQuestion = Question.toQuestion(line);

                // • jedes resultierende Question-Objekt im Exam speichert
                this.questions.add(newQuestion);
            }
        } // Keine catch-Klausel, da IOException propagiert wird
    }

    @Test
    void testExam() throws IOException {
        Exam exam = new Exam();
        exam.readQuestions();
        exam.toTest();


        FileInputStream fis = new FileInputStream("test.tex");
        fis.close();
    }

}