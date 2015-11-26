package Control;

import Engine.User;

public interface SMKGameInterface {

    public boolean checkGuess(int correct); // Checkguess with int from pushAnswerButton
    public void pushAnswerButton(int i, User user); // Answer button smartphone
}
