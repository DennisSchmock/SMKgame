package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InputOutput {

    BufferedReader read;
    private static ArrayList<Question> questions;
    File filename;
    
    
    public InputOutput() {

    }

    public boolean load(String filename) {

        try {
            FileReader read = new FileReader(filename);
            BufferedReader r = new BufferedReader(read);
            while (true) {
                String s = r.readLine();
                if (s == null) {
                    break;
                }
                // words a seperated by the comma in the textfile
                String q = s.split(",")[0].trim();
                String a1 = s.split(",")[1].trim();
                String a2 = s.split(",")[2].trim();
                String a3 = s.split(",")[3].trim();
                String a4 = s.split(",")[4].trim();
                String correct = s.split(",")[5].trim();
                //needs to be intialized
                ImageIcon pic = null;
                //the object, quiz, should consist of the strings from above
                Question quest = new Question(q, a1, a2, a3, a4, pic, correct);
                questions.add(quest);

            }

            read.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    // Not being used.
    public void useReaderIcon() {
        ImageIcon image = new ImageIcon("images/image.png");
        JLabel imageLabel = new JLabel(image);
        //   frame.add(imageLabel);

    }

    public static ArrayList<Question> loadQuestions(String filename) {

        //Put logic for loading question here
        questions = new ArrayList();
        return questions;
    }

}
