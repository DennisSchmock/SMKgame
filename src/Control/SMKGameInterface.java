package Control;

import Engine.User;
import java.util.ArrayList;

public interface SMKGameInterface {

    public void timer();
    public String randomQuestion(); //done
    public String load(); //done
    public boolean checkGuess(int correct); //done
    public int size(); //done
    public void clear();
    public ArrayList<User> returnRank();
    public String[] answerOptions();
    public int Points();

}