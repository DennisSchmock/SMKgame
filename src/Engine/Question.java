package Engine;

import javax.swing.ImageIcon;

public class Question {
   private String question;
   private String a1;
   private String a2;
   private String a3;
   private String a4;
   private int correctAnswer;
   private ImageIcon picture;
   
   
public Question(String q, String a1, String a2, String a3, String a4, ImageIcon pic, int correct){
    this.question = q;
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
    this.a4 = a4;
    this.picture = pic;
    this.correctAnswer = correct;
    
}

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @return the a1
     */
    public String getA1() {
        return a1;
    }

    /**
     * @return the a2
     */
    public String getA2() {
        return a2;
    }

    /**
     * @return the a3
     */
    public String getA3() {
        return a3;
    }

    /**
     * @return the a4
     */
    public String getA4() {
        return a4;
    }

    /**
     * @return the correctAnswer
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * @return the picture
     */
    public ImageIcon getPicture() {
        return picture;
    }

  
}
