package Engine;

import Control.SMKmain;
import Engine.InputOutput;
import Engine.Question;
import Engine.User;
import SMKGUI.Smartphone;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.Timer;

public class Engine {
    
    private static Timer timer;
    private static int countIntro = 200;
    private static int countUser = 200;
    private static int countAnswer = 300;
    private static int countScore = 200;
    private static int countRanking = 200;
    private static int numberQ = 5;
    private static int countUp;
    private static Question currentQuestion;
    private static User user;
    private static InputOutput io = new InputOutput();
    private static Smartphone smartphone;
    private static Clip clip;


    //Arraylisten hvor alle vores spørgsmål/svar ligger. 
   // ArrayList<Question> questions = InputOutput.getQuestions();

    //Bliver brugt hos randomQuestion
    private static Random rnd = new Random();
    private static Question lastShownQuestion;

    //Hvor pointene bliver gemt midlertidigt.
    private static int points = 0;

public Engine(Smartphone sp, User u){
    smartphone = sp;
    user = u;
    
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

  

    public static void setTempAnswer(int i, User user) {
        user.setTempAnswer(i);

    }

    /**
     * @return the countUp
     */
    public static int getCountUp() {
        return countUp;
    }

    /**
     * @param aCountUp the countUp to set
     */
    public static void setCountUp(int aCountUp) {
        countUp = aCountUp;
    }

    public static void backgroundMusic(String filename) {

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(filename));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            System.out.println(uae);
        }
    }

    public static void stopMusic() {
        clip.stop();
    }
    
    public static void theTimer() {

        ActionListener actListner = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                setCountUp(getCountUp() + 1);
                if (getCountUp() <= countIntro) {
                    smartphone.jProgressBar1.setMaximum(countIntro);
                    smartphone.jProgressBar1.setValue(countIntro - getCountUp());
                    smartphone.bigscreen.jProgressBar1.setMaximum(countIntro);
                    smartphone.bigscreen.jProgressBar1.setValue(countIntro - getCountUp());

                } else if (getCountUp() <= countUser + countIntro) {
                    smartphone.userPanel();
                    smartphone.jProgressBar2.setMaximum(countUser);
                    smartphone.jProgressBar2.setValue(countUser - (getCountUp() - countIntro));
                    smartphone.nameLabel.setText(user.getName());
                    smartphone.jLabel6.setIcon(user.getPicture());

                    smartphone.bigscreen.jProgressBar2.setMaximum(countUser);
                    smartphone.bigscreen.jProgressBar2.setValue(countUser - (getCountUp() - countIntro));
                    if (getCountUp() == countUser + countIntro - 1) {
                        backgroundMusic("src/SMKGUI_pics/qsound.wav");
                    }

                } else if (getCountUp() <= countUser + countIntro + countAnswer) {
                    currentQuestion = InputOutput.getQuestions().get(0);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (getCountUp() == countUser + countIntro + countAnswer - 1) {
                        Engine.checkGuess(currentQuestion, user);
                        smartphone.resetButtons();
                        user.setTempAnswer(0);
                        stopMusic();
                        backgroundMusic("src/SMKGUI_pics/qsound.wav");
                    }
                } else if (getCountUp() <= countUser + countIntro + countAnswer * 2) {

                    currentQuestion = InputOutput.getQuestions().get(1);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 2));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 2));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (getCountUp() == countUser + countIntro + (countAnswer * 2) - 1) {
                        smartphone.resetButtons();
                        checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        stopMusic();
                        backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (getCountUp() <= countUser + countIntro + countAnswer * 3) {

                    currentQuestion = InputOutput.getQuestions().get(2);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 3));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 3));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (getCountUp() == countUser + countIntro + countAnswer * 3 - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        stopMusic();
                        backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (getCountUp() <= countUser + countIntro + countAnswer * 4) {

                    currentQuestion = InputOutput.getQuestions().get(3);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 4));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 4));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (getCountUp() == countUser + countIntro + countAnswer * 4 - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        stopMusic();
                        backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (getCountUp() <= countUser + countIntro + countAnswer * numberQ) {

                    currentQuestion = InputOutput.getQuestions().get(4);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * numberQ));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (getCountUp() - countIntro - countAnswer * 5));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (getCountUp() == countUser + countIntro + countAnswer * 5 - 1) {
                        smartphone.resetButtons();
                        checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        stopMusic();

                    }

                } else if (getCountUp() <= countUser + countIntro + countAnswer * numberQ + countScore) {

                    smartphone.scorePanel();
                    smartphone.jProgressBar4.setMaximum(countUser);
                    smartphone.jProgressBar4.setValue(countUser - (getCountUp() - countIntro - countAnswer * numberQ - countScore));
                    smartphone.scoreLabel.setText(user.getScore() + " / 5 correct answers");
                    smartphone.bigscreen.jLabel14.setText("Congratulations " + user.getName());
                    smartphone.bigscreen.jLabel15.setText("With a score of " + user.getScore() + " / 5 correct answers.");

                } else if (getCountUp() <= countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
                    smartphone.rankingPanel();
                    smartphone.jProgressBar5.setMaximum(countUser);
                    smartphone.jProgressBar5.setValue(countUser - (getCountUp() - countIntro - countAnswer * numberQ - countScore - countRanking));

                } else if (getCountUp() > countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
                    timer.stop();
                    smartphone.bigscreen.dispose();
                    smartphone.dispose();
                    try {
                        String[] args = {""};

                        SMKmain.main(args);
                    } catch (Exception ex) {
                    }
                }

            }

        };

        timer = new Timer(10, actListner);
        timer.start();
    }

}
