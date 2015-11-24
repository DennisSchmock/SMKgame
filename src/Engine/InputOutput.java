package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InputOutput {

    BufferedReader read;
    public static ArrayList<Question> questions;
    public static ArrayList<User> userName;
    File filename;

    public InputOutput() {
        load("fil.txt");
        userLoad("filen.txt");
    }

    public boolean load(String filename) {
        questions = new ArrayList<>();
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
                String imagepath = "/SMKGUI/" + s.split(",")[5].trim();
                String number = s.split(",")[6].trim();
                int correct = parseInt(number);
                
                ImageIcon pic = questionIcon(imagepath);
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
    public ImageIcon questionIcon(String path) {
        
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
    }
    
    
    public boolean userLoad(String filename){
        
    try {
            FileReader read = new FileReader(filename);
            BufferedReader r = new BufferedReader(read);
            while (true) {
                String s = r.readLine();
                if (s == null) {
                    break;
                }
                // words a seperated by the comma in the textfile
                String name = s.split(",")[0].trim();
                String imagepath = "/SMKGUI.newpackage/" + s.split(",")[1].trim();
                ImageIcon picture = questionIcon(imagepath);
                User user = new User(name, picture);               
                userName.add(user);

            }

            read.close();
        } catch (IOException e) {
            return false;
        }
        return true;
        
    }

    public static ArrayList<Question> loadQuestions() {
        //Put logic for loading question here
        return questions;
    }
    
    public static void shuffleQuestions(){
        Collections.shuffle(questions);
    }
}
