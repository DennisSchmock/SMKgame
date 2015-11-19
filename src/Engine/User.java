package Engine;

import javax.swing.ImageIcon;

public class User {
private String name;
private ImageIcon picture;
private int score;


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
}
