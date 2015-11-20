package Engine;

import java.util.ArrayList;

public class Engine {

    private ArrayList<Question> questions;
 
    public String returnQuestion() {
        return "Haha";
    }

    public String[] returnAnswers() {
        String[] answers = {"one", "two"};
        return answers;
    }

    public boolean checkGuess(String currentQuestion, int correct) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getQuestion().equals(currentQuestion)) {
                if (questions.get(i).getCorrectAnswer() == correct) {
                    return true;
                }
            }
        }
        return false;
    }
}
