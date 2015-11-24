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

        Engine engine = new Engine();
        InputOutput io;
        User user;
        
        /*for (Question al1 : al) {
            System.out.println(al1.getQuestion());
            System.out.println(al1.getA1());
            System.out.println(al1.getCorrect());
            System.out.println(al1.getPicture());
        }
        System.out.println("test");*/
        
        //Test of different methods in Engine/SMKGame
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(3));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(2));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(2));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(3));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(2));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(3));
        System.out.println(engine.randomQuestion());
        System.out.println(engine.checkGuess(2));
        
        //Test Score System
        System.out.println(engine.getPoints());
        
    }
}
