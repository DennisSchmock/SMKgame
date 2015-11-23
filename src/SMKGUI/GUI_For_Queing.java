package Control;

import SMKGUI.Smartphone;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class GUI_For_Queing {

    private static Timer timer;
    private static int countDown;
    private static boolean gameBool = true;

    public static void main(String[] args) {
        // Smartphone GUI
        Smartphone smartphone = new Smartphone();
        smartphone.setVisible(true);
        
       
        theTimer(smartphone.jProgressBar1, 300);
            
        

    }

    public static boolean theTimer(final JProgressBar j, final int max) {
       
        new JFrame().setVisible(true);
        ActionListener actListner = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                countDown++;

                j.setValue(countDown);
                if (countDown > max) {

                    timer.stop();
                    gameBool = false;
                    
                }
            }

        };

        timer = new Timer(100, actListner);
        timer.start();
        return true;
    }
}
