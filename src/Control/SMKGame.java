package Control;

import Engine.Engine;
import Engine.User;

public class SMKGame implements SMKGameInterface {

    @Override
    public boolean checkGuess(int correct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void pushAnswerButton(int i, User user) {
        Engine.setTempAnswer(i, user);
    }

    public void startGame() {
        Engine.theTimer();
    }

    public void resetGame() {
        Engine.resetGame();
    }
}
