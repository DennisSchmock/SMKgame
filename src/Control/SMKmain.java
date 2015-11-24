package Control;

import Engine.Engine;
import Engine.InputOutput;
import Engine.Question;
import Engine.User;
import SMKGUI.Smartphone;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SMKmain {

    private static Timer timer;
    private static int countIntro = 200;
    private static int countUser = 200;
    private static int countAnswer = 1600;
    private static int countScore = 200;
    private static int countRanking = 200;
    private static int numberQ = 5;
    private static int countUp;
    private static boolean gameBool = true;
    private static Smartphone smartphone;
    private static Question currentQuestion;
    private static User user = new User();
    private static Engine engine = new Engine();
    private static InputOutput io = new InputOutput();

    public static void main(String[] args) {
        countUp = 0;
        smartphone = new Smartphone(user);
        smartphone.setVisible(true);
        io.load("fil.txt");
        InputOutput.shuffleQuestions();
        

        theTimer();
    }

    public static void theTimer() {
        

        ActionListener actListner = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                countUp++;
                if (countUp <= countIntro) {
                    smartphone.jProgressBar1.setMaximum(countIntro);
                    smartphone.jProgressBar1.setValue(countIntro - countUp);
                    smartphone.bigscreen.jProgressBar1.setMaximum(countIntro);
                    smartphone.bigscreen.jProgressBar1.setValue(countIntro - countUp);

                } else if (countUp <= countUser + countIntro) {
                    smartphone.userPanel();
                    smartphone.jProgressBar2.setMaximum(countUser);
                    smartphone.jProgressBar2.setValue(countUser - (countUp - countIntro));

                    smartphone.bigscreen.jProgressBar2.setMaximum(countUser);
                    smartphone.bigscreen.jProgressBar2.setValue(countUser - (countUp - countIntro));
                    if (countUp==countUser + countIntro-1){
                        engine.backgroundMusic("src/SMKGUI_pics/qsound.wav");
                    }

                } else if (countUp <= countUser + countIntro + countAnswer) {
                    currentQuestion = InputOutput.questions.get(0);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (countUp == countUser + countIntro + countAnswer - 1) {
                        Engine.checkGuess(currentQuestion, user);
                        smartphone.resetButtons();
                        user.setTempAnswer(0);
                        engine.stopMusic();
                        engine.backgroundMusic("src/SMKGUI_pics/qsound.wav");



                    }
                } else if (countUp <= countUser + countIntro + countAnswer * 2) {

                    currentQuestion = InputOutput.questions.get(1);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 2));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 2));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (countUp == countUser + countIntro + (countAnswer * 2) - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        engine.stopMusic();
                        engine.backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (countUp <= countUser + countIntro + countAnswer * 3) {

                    currentQuestion = InputOutput.questions.get(2);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 3));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 3));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (countUp == countUser + countIntro + countAnswer * 3 - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        engine.stopMusic();
                        engine.backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (countUp <= countUser + countIntro + countAnswer * 4) {

                    currentQuestion = InputOutput.questions.get(3);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 4));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 4));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (countUp == countUser + countIntro + countAnswer * 4 - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        engine.stopMusic();
                        engine.backgroundMusic("src/SMKGUI_pics/qsound.wav");

                    }

                } else if (countUp <= countUser + countIntro + countAnswer * numberQ) {

                    currentQuestion = InputOutput.questions.get(4);
                    smartphone.answerPanel();
                    smartphone.jProgressBar3.setMaximum(countAnswer);
                    smartphone.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * numberQ));
                    smartphone.bigscreen.jProgressBar3.setMaximum(countAnswer);
                    smartphone.bigscreen.jProgressBar3.setValue(countUser - (countUp - countIntro - countAnswer * 5));
                    smartphone.bigscreen.jLabel11.setText(currentQuestion.getQuestion());
                    smartphone.answerButtonA.setText(currentQuestion.getA1());
                    smartphone.answerButtonB.setText(currentQuestion.getA2());
                    smartphone.answerButtonC.setText(currentQuestion.getA3());
                    smartphone.answerButtonD.setText(currentQuestion.getA4());
                    smartphone.bigscreen.jLabel13.setIcon(currentQuestion.getPicture());
                    if (countUp == countUser + countIntro + countAnswer * 5 - 1) {
                        smartphone.resetButtons();
                        Engine.checkGuess(currentQuestion, user);
                        user.setTempAnswer(0);
                        engine.stopMusic();

                    }

                } else if (countUp <= countUser + countIntro + countAnswer * numberQ + countScore) {

                    smartphone.scorePanel();
                    smartphone.jProgressBar4.setMaximum(countUser);
                    smartphone.jProgressBar4.setValue(countUser - (countUp - countIntro - countAnswer * numberQ - countScore));
                    smartphone.scoreLabel.setText(user.getScore() + " / 5 correct answers");
                    smartphone.bigscreen.jLabel14.setText("Congratulations " + user.getName());
                    smartphone.bigscreen.jLabel15.setText("With a score of " +user.getScore() + " / 5 correct answers.");
                    

                } else if (countUp <= countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
                    smartphone.rankingPanel();
                    smartphone.jProgressBar5.setMaximum(countUser);
                    smartphone.jProgressBar5.setValue(countUser - (countUp - countIntro - countAnswer * numberQ - countScore - countRanking));

                } else if (countUp > countUser + countIntro + countAnswer * numberQ + countScore + countRanking) {
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
