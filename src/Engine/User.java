package Engine;

import Control.SMKGame;
import javax.swing.ImageIcon;

public class User {
private String name;
private ImageIcon picture;
private int score = 0;
Engine engine = new Engine();
SMKGame smk = new SMKGame();


public User(String name, ImageIcon picture){
    this.name = name;
    this.picture = picture;
}
public User() {
    
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
    public void setScore() {
        this.score = smk.getPoints();
    }
}
