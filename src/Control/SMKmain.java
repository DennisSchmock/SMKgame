/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Engine.*;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class SMKmain {

    public static void main(String[] args) {

        SMKGame test = new SMKGame();
        
        /*for (Question al1 : al) {
            System.out.println(al1.getQuestion());
            System.out.println(al1.getA1());
            System.out.println(al1.getCorrect());
            System.out.println(al1.getPicture());
        }
        System.out.println("test");*/
        
        System.out.println(test.checkGuess("what year is", 2));
    }
}
