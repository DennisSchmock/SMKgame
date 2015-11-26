package Control;

import Engine.Engine;
import Engine.InputOutput;
import Engine.User;
import SMKGUI.Smartphone;

public class SMKmain {

    private static User user;
    private static Engine engine;
    private static InputOutput io;
    private static Smartphone smartphone;

    public static void main(String[] args) {
        io = new InputOutput();
        Engine.setCountUp(0);
        InputOutput.shuffleQuestions();
        InputOutput.shuffleUsers();

        user = InputOutput.loadUsers().get(0); // Load users
        smartphone = new Smartphone(user); // Initialize smartphone class
        engine = new Engine(smartphone, InputOutput.loadUsers()); // Calling engine constructor
        smartphone.setVisible(true); // Make smartphone visible
        Engine.backgroundMusic("src/SMKGUI_pics/lyk.wav"); // Load background music
    }
}
