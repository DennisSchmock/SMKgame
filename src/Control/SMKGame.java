package Control;

import Engine.Engine;
import Engine.InputOutput;
import Engine.Question;
import Engine.User;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dennis
 */
public class SMKGame implements SMKGameInterface {

    private static Random rnd = new Random();
    private Question lastShownQuestion;
    Engine engine = new Engine();
    ArrayList<Question> questions = InputOutput.loadQuestions();

    @Override
    public void timer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String randomQuestion() {
        int randomRangeUpperLimit = size();
        int randomNumber = rnd.nextInt(randomRangeUpperLimit);
        Question question = questions.get(randomNumber);
        lastShownQuestion = question;
        return question.getQuestion();
    }

    @Override
    public String load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkGuess(int correct) {
        if (lastShownQuestion.getCorrect() == correct) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return questions.size();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> returnRank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] answerOptions() {
        return engine.returnAnswers();

    }
    @Override
    public int Points() {
             throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void pushAnswerButton(int i, User user){
        Engine.setTempAnswer(i, user);
    }
    

}
