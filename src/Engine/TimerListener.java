/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Dennis
 */
public class TimerListener extends JPanel implements ActionListener {
    Timer timer = new Timer(1000, new TimerListener());
    int elapsedSeconds = 30;
    JLabel timerLabel = new JLabel();
    
    

    @Override
    public void actionPerformed(ActionEvent evt) {
        elapsedSeconds--;
        timerLabel.setText("" + elapsedSeconds);
        if (elapsedSeconds <= 0) {
            timer.stop();
            
        }
    }

}

