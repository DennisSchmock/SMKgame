package Engine;

import Engine.InputOutput;
import Engine.Question;
import Engine.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Engine {

    InputOutput io = new InputOutput();
    private static Clip clip;
    MediaPlayer mediaPlayer;

    //Arraylisten hvor alle vores spørgsmål/svar ligger. 
    ArrayList<Question> questions = InputOutput.loadQuestions();

    //Bliver brugt hos randomQuestion
    private static Random rnd = new Random();
    private static Question lastShownQuestion;

    //Hvor pointene bliver gemt midlertidigt.
    private static int points = 0;

    public String randomQuestion() {
        int randomRangeUpperLimit = size();
        int randomNumber = rnd.nextInt(randomRangeUpperLimit);
        Question question = questions.get(randomNumber);
        lastShownQuestion = question;
        return question.getQuestion();
    }

    public static boolean checkGuess(Question question, User user) {
        if (question.getCorrect() == user.getTempAnswer()) {
            setPoints(user.getScore() + 1, user);
            System.out.println("User answered correct");
            System.out.println("Userscore: " + user.getScore());
            return true;
        } else {
            System.out.println("User answered incorrect");
            return false;
        }
    }

    /**
     * @param points the points to set
     */
    public static void setPoints(int p, User user) {
        user.setScore(p);
    }

    public static int getPoints(User user) {
        return points;
    }

    public int size() {
        return questions.size();
    }

    public static void setTempAnswer(int i, User user) {
        user.setTempAnswer(i);

    }

    public void backgroundMusic(String filename) {

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(filename));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            System.out.println(uae);
        }
    }

    public void stopMusic() {
        clip.stop();
    }

}
