package Control;

import Engine.User;
import java.util.ArrayList;

public interface SMKGameInterface {

    public void timer();
    public String randomQuestion();
    public String load();
    public boolean checkGuess(String q, int correct);
    public int size();
    public void clear();
    public ArrayList<User> returnRank();
    public String getQuestion();
    public String[] answerOptions();

}