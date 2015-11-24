package Engine;

import javax.swing.ImageIcon;

public class User {
private String name;
private ImageIcon picture;
private int score;
private int tempAnswer;



public User(){
    
}
public User(String name, ImageIcon picture){
    this.name = name;
    this.picture = picture;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the picture
     */
    public ImageIcon getPicture() {
        return picture;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the tempAnswer
     */
    public int getTempAnswer() {
        return tempAnswer;
    }

    /**
     * @param tempAnswer the tempAnswer to set
     */
    public void setTempAnswer(int tempAnswer) {
        this.tempAnswer = tempAnswer;
    }
}
