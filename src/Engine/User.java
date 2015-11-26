package Engine;

import Control.SMKGame;
import javax.swing.ImageIcon;

public class User {

    private String name; //For storing the users name
    private ImageIcon picture; //For storing the icon of the player
    private ImageIcon pictureSmall; //For storing the smaller version of the players icon;
    private Integer score; //For storing the players score
    private int tempAnswer; //For storing the answer of the player when he presses an answerbutton

    public User() {

    }
    //Constructor for setting nam and pictures of the player
    public User(String name, ImageIcon picture, ImageIcon pictureSmall) {
        this.name = name;
        this.picture = picture;
        this.pictureSmall = pictureSmall;
        this.score = 0;
    }


//Setters and getters below this point.
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
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int i) {
        this.score = i;
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

    /**
     * @return the pictureSmall
     */
    public ImageIcon getPictureSmall() {
        return pictureSmall;
    }

    /**
     * @param pictureSmall the pictureSmall to set
     */
    public void setPictureSmall(ImageIcon pictureSmall) {
        this.pictureSmall = pictureSmall;
    }
    
    
}
