package Engine;

import java.util.ArrayList;

public class Engine {
 
    public String returnQuestion(){
        return "Haha";
    }

    public String[] returnAnswers() {
        String[] answers = {"one", "two"};
        return answers;
    }
    
    public static void setTempAnswer(int i, User user){
        user.setTempAnswer(i);
    }
    
}
