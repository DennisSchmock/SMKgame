package Engine;

import Control.SMKGame;
import javax.swing.ImageIcon;

public class User {

    private String name;
    private ImageIcon picture;
    private ImageIcon pictureSmall;
    private Integer score;
    private int tempAnswer;

    public User() {

    }

    public User(String name, ImageIcon picture, ImageIcon pictureSmall) {
        this.name = name;
        this.picture = picture;
        this.pictureSmall = pictureSmall;
        this.score = 0;
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
