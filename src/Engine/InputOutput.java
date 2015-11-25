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

public class InputOutput {

    BufferedReader read;
    private static ArrayList<Question> questions;
    private static ArrayList<User> users;
    File filename;

    public InputOutput() {
        load("fil.txt");
        userLoad("users.txt");
    }

    public boolean load(String filename) {
        questions = new ArrayList<>();

        try {
            FileReader read = new FileReader(filename);
            BufferedReader r = new BufferedReader(read);
            String s = r.readLine();
            while (s != null) {

                // words a seperated by the comma in the textfile
                String q = s.split(",")[0].trim();
                String a1 = s.split(",")[1].trim();
                String a2 = s.split(",")[2].trim();
                String a3 = s.split(",")[3].trim();
                String a4 = s.split(",")[4].trim();
                String imagepath = "/SMKGUI_pics/" + s.split(",")[5].trim();
                String number = s.split(",")[6].trim();
                int correct = parseInt(number);

                ImageIcon pic = questionIcon(imagepath);
                //the object, quiz, should consist of the strings from above
                Question quest = new Question(q, a1, a2, a3, a4, pic, correct);
                questions.add(quest);
                s = r.readLine();

            }

            read.close();
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public ImageIcon questionIcon(String path) {

        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public boolean userLoad(String filename) {
        users = new ArrayList<>();
        try {
            FileReader read = new FileReader(filename);
            BufferedReader r = new BufferedReader(read);
            String s = r.readLine();

            while (s != null) {

                // words a seperated by the comma in the textfile
                String name = s.split(",")[0].trim();
                String imagepath = "/SMKGUI_pics/" + s.split(",")[1].trim();
                String imagepath2 = "/SMKGUI_pics/" + s.split(",")[2].trim();
                ImageIcon picture = questionIcon(imagepath);
                ImageIcon pictureSmall = questionIcon(imagepath2);
                User user = new User(name, picture, pictureSmall);
                users.add(user);
                s = r.readLine();

            }

            read.close();
        } catch (IOException e) {
            return false;
        }
        return true;

    }

    public static ArrayList<Question> getQuestions() {
        return questions;
    }

    public static ArrayList<User> loadUsers() {
        return users;
    }

    public static void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public static void shuffleUsers() {
        Collections.shuffle(users);
    }
}
