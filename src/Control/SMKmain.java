/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Engine.*;

/**
 *
 * @author Dennis
 */
public class SMKmain {

    public static void main(String[] args) {

        SMKGame test = new SMKGame();
        InputOutput io = new InputOutput();
        
        /*for (Question al1 : al) {
            System.out.println(al1.getQuestion());
            System.out.println(al1.getA1());
            System.out.println(al1.getCorrect());
            System.out.println(al1.getPicture());
        }
        System.out.println("test");*/
        System.out.println(test.randomQuestion());
        System.out.println(test.checkGuess(2));
        
    }
}
