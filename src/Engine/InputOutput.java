package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InputOutput {

    BufferedReader read;
    private static ArrayList<Question> questions = new ArrayList();
    File filename;
    
    
    
    public  InputOutput() {
    }

    public static boolean load(String filename) {

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
                String number = s.split(",")[5].trim();
                int correct = parseInt(number);
                System.out.println(q + a1 +a2+a3+a4+number);
                //needs to be intialized
                ImageIcon pic = null;
                //the object, quiz, should consist of the strings from above
                Question quest = new Question(q, a1, a2, a3, a4, pic, 1);
                questions.add(quest);

            }

            read.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    // Not being used.
    public static ImageIcon QuestionIcon(String filename) {
        ImageIcon image = new ImageIcon(filename);
        return image;

    }

    public static ArrayList<Question> loadQuestions() {

        //Put logic for loading question here
        return questions;
    }
    
   

}
