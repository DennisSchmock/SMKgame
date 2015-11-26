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

//    private static Timer timer;
//    private static int countIntro = 200;
//    private static int countUser = 200;
//    private static int countAnswer = 300;
//    private static int countScore = 200;
//    private static int countRanking = 200;
//    private static int numberQ = 5;
//    private static int countUp;
//    private static Question currentQuestion;
    private static User user;
    private static Engine engine;
    private static InputOutput io;
    private static Smartphone smartphone;

    public static void main(String[] args) {
        io = new InputOutput();
        Engine.setCountUp(0);
        InputOutput.shuffleQuestions();
        InputOutput.shuffleUsers();

        user = InputOutput.loadUsers().get(0);
        smartphone = new Smartphone(user);
        engine = new Engine(smartphone,InputOutput.loadUsers());
        smartphone.setVisible(true);
        Engine.backgroundMusic("src/SMKGUI_pics/lyk.wav");
        

    }

}
