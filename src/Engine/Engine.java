package Engine;

import Engine.InputOutput;
import Engine.Question;
import Engine.User;
import java.util.ArrayList;
import java.util.Random;

public class Engine {

    InputOutput io = new InputOutput();
    
    //Arraylisten hvor alle vores spørgsmål/svar ligger. 
    ArrayList<Question> questions = InputOutput.loadQuestions();

    //Bliver brugt hos randomQuestion
    private static Random rnd = new Random();
    private static Question lastShownQuestion;

    //Hvor pointene bliver gemt midlertidigt.
    private static int points = 0;

    public String randomQuestion() {
        int randomRangeUpperLimit = size();
        int randomNumber = rnd.nextInt(randomRangeUpperLimit);
        Question question = questions.get(randomNumber);
        lastShownQuestion = question;
        return question.getQuestion();
    }

    public static boolean checkGuess(Question question,User user) {
        if (question.getCorrect() == user.getTempAnswer()) {
            setPoints(getPoints(user) + 1,user);
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
    public static void setPoints(int p,User user) {
        user.setScore(p);
    }

    public static int getPoints(User user) {
        return points;
    }

    public int size() {
        return questions.size();
    }
    
    public static void setTempAnswer(int i, User user){
        user.setTempAnswer(i);
    }
    
}
