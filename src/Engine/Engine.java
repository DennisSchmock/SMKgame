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
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Engine {

    private static Timer timer;

    //These variables control the flow of the game. Timer settings.
    private static int countIntro = 200;
    private static int countUser = 500;
    private static int countAnswer = 1600;
    private static int countScore = 1000;
    private static int countRanking = 500;
    private static int drumRoll = 530;
    private static int numberQ = 5;
    private static int countUp;
    private static Question currentQuestion; //We store the current question here
    private static User user; //The user object
    private static InputOutput io = new InputOutput();
    private static Smartphone smartphone; //For controlling the GUI
    private static Clip clip; //For storing the soundclip
    private static ArrayList<User> users; //An array of users

    //Method for starting a new game.
    public static void resetGame() {
        smartphone.bigscreen.dispose();
        smartphone.dispose();
        try {
            String[] args = {""};

            SMKmain.main(args);
        } catch (Exception ex) {
        }
    }

    public Engine(Smartphone sp, ArrayList<User> users) {
        smartphone = sp;
        this.users = users;
        user = users.get(0);
    }

    //This method is used for checking if the user guessed the correct answer.
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

    //These method sets the answer of the user.
    public static void setTempAnswer(int i, User user) {
        user.setTempAnswer(i);

    }

    //This method plays a wav file. Argument is the filename of a wav.
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

    //For stopping a sound
    public static void stopMusic() {
        clip.stop();
    }

    //This method controls the flow of the game. It is control by a timer object. Hardcoded and static, but works.
    public static void theTimer() {

        ActionListener actListner = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                setCountUp(getCountUp() + 1);
                //Show introscreen on bigscreen and "smartphone".
                if (getCountUp() <= countIntro) {
                    smartphone.jProgressBar1.setMaximum(countIntro);
                    smartphone.jProgressBar1.setValue(countIntro - getCountUp());
                    smartphone.bigscreen.jProgressBar1.setMaximum(countIntro);
                    smartphone.bigscreen.jProgressBar1.setValue(countIntro - getCountUp());

                    //Show users joining. Simulating other users joining in.
                } else if (getCountUp() <= countUser + countIntro) {
                    if (getCountUp() == countIntro + 100) {
                        smartphone.bigscreen.player1.setIcon(users.get(0).getPictureSmall());
                        smartphone.bigscreen.player1.setText(users.get(0).getName());
                        backgroundMusic("src/SMKGUI_pics/pop.wav");

                    }
                    if (getCountUp() == countIntro + 150) {
                        smartphone.bigscreen.player2.setIcon(users.get(1).getPictureSmall());
                        smartphone.bigscreen.player2.setText(users.get(1).getName());
                        backgroundMusic("src/SMKGUI_pics/pop.wav");

                    }
                    if (getCountUp() == countIntro + 300) {
                        smartphone.bigscreen.player3.setIcon(users.get(2).getPictureSmall());
                        smartphone.bigscreen.player3.setText(users.get(2).getName());
                        backgroundMusic("src/SMKGUI_pics/pop.wav");

                    }
                    if (getCountUp() == countIntro + 400) {
                        smartphone.bigscreen.player4.setIcon(users.get(3).getPictureSmall());
                        smartphone.bigscreen.player4.setText(users.get(3).getName());
                        backgroundMusic("src/SMKGUI_pics/pop.wav");

                    }
                    if (getCountUp() == countIntro + 430) {
                        smartphone.bigscreen.player5.setIcon(users.get(4).getPictureSmall());
                        smartphone.bigscreen.player5.setText(users.get(4).getName());
                        backgroundMusic("src/SMKGUI_pics/pop.wav");

                    }
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

                    //Show the Questions on the big screen and answeroptions on smartphone
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
                        giveUsersRandomPoints();
                        Engine.sortUsersScore();
                        backgroundMusic("src/SMKGUI_pics/drumroll.wav");

                    }
                    //Show the winner on bigscreen and the users score on smartphone panel.
                } else if (getCountUp() <= countUser + countIntro + countAnswer * numberQ + countScore) {
                    if (getCountUp() == countUser + countIntro + (countAnswer * 5) + drumRoll) {
                        smartphone.bigscreen.WinnerIcon.setIcon(users.get(0).getPicture());
                        smartphone.bigscreen.jLabel15.setText("Congratulations " + users.get(0).getName());
                        smartphone.bigscreen.jLabel14.setText("With a score of " + users.get(0).getScore() + " / 5 correct answers.");
                    }
                    smartphone.scoreLabel.setText(user.getScore() + " / 5 correct answers");

                    smartphone.scorePanel();
                    smartphone.jProgressBar4.setMaximum(countUser);
                    smartphone.jProgressBar4.setValue(countUser - (getCountUp() - countIntro - countAnswer * numberQ - countScore));
                    //Show the ranking based on score
                } else if (getCountUp() <= countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
                    if (getCountUp() == countUser + countIntro + countAnswer * numberQ + countScore + 100) {
                        setRanks();
                    }
                    smartphone.rankingPanel();
                    //Show the answers to the questions.
                } else if (getCountUp() > countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
                    smartphone.bigscreen.bigCorrectAnswerPanel();

                    timer.stop();
                    setCorrectQA();

                }
            }
        };

        timer = new Timer(10, actListner);
        timer.start();
    }
    
    //This method displays the correct answers in the list
    public static void setCorrectQA() {
        ArrayList<JLabel> jlabels = new ArrayList<>();
        jlabels.add(smartphone.bigscreen.q1);
        jlabels.add(smartphone.bigscreen.q2);
        jlabels.add(smartphone.bigscreen.q3);
        jlabels.add(smartphone.bigscreen.q4);
        jlabels.add(smartphone.bigscreen.q5);
        int i = 0;
        for (JLabel jlabel : jlabels) {
            jlabel.setText(InputOutput.getQuestions().get(i).getQuestion());
            i++;
        }
        jlabels.clear();
        jlabels.add(smartphone.bigscreen.a1);
        jlabels.add(smartphone.bigscreen.a2);
        jlabels.add(smartphone.bigscreen.a3);
        jlabels.add(smartphone.bigscreen.a4);
        jlabels.add(smartphone.bigscreen.a5);
        i = 0;
        for (JLabel jlabel : jlabels) {
            if (InputOutput.getQuestions().get(i).getCorrect() == 1) {
                jlabel.setText(InputOutput.getQuestions().get(i).getA1());
            }
            if (InputOutput.getQuestions().get(i).getCorrect() == 2) {
                jlabel.setText(InputOutput.getQuestions().get(i).getA2());
            }
            if (InputOutput.getQuestions().get(i).getCorrect() == 3) {
                jlabel.setText(InputOutput.getQuestions().get(i).getA3());
            }
            if (InputOutput.getQuestions().get(i).getCorrect() == 4) {
                jlabel.setText(InputOutput.getQuestions().get(i).getA4());
            }
            i++;
        }

    }
    //This method sets the ranks for the ranking panel
    public static void setRanks() {
        ArrayList<JLabel> jlabels = new ArrayList<>();
        jlabels.add(smartphone.bigscreen.rank1);
        jlabels.add(smartphone.bigscreen.rank2);
        jlabels.add(smartphone.bigscreen.rank3);
        jlabels.add(smartphone.bigscreen.rank4);
        jlabels.add(smartphone.bigscreen.rank5);
        int i = 0;
        for (JLabel jlabel : jlabels) {

            jlabel.setText(users.get(i).getName());
            jlabel.setIcon(users.get(i).getPictureSmall());
            i++;
        }
        jlabels.clear();
        jlabels.add(smartphone.bigscreen.score1);
        jlabels.add(smartphone.bigscreen.score2);
        jlabels.add(smartphone.bigscreen.score3);
        jlabels.add(smartphone.bigscreen.score4);
        jlabels.add(smartphone.bigscreen.score5);
        i = 0;
        for (JLabel jlabel : jlabels) {
            jlabel.setText("" + users.get(i).getScore());
            i++;
        }

    }

    //For giving the four simulated users a random score
    private static void giveUsersRandomPoints() {
        Random rand = new Random();
        users.get(1).setScore(rand.nextInt(6));
        users.get(2).setScore(rand.nextInt(6));
        users.get(3).setScore(rand.nextInt(6));
        users.get(4).setScore(rand.nextInt(6));

    }

    //This method sorts the users arraylist based on their score
    private static void sortUsersScore() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {

                return user1.getScore().compareTo(user2.getScore());
            }

        });
        Collections.reverse(users);
    }

    //Setters and getters below this point
    /**
     * @param points the points to set
     */
    public static void setPoints(int p, User user) {
        user.setScore(p);
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

}
