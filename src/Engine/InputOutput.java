package Engine;

import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InputOutput {

    BufferedReader read;
   private static ArrayList<Question> questions;

    public InputOutput() {

    }

    public void load() {

    }

    public void useReaderIcon() {

        ImageIcon image = new ImageIcon("images/image.png");
        JLabel imageLabel = new JLabel(image);

    }
    
    public static ArrayList<Question> loadQuestions(String filename){
        questions = new ArrayList();
        return questions;
    }

}
