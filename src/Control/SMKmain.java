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
        
        InputOutput io = new InputOutput();
        
        System.out.println( io.load("fil.txt"));
        System.out.println();
        for (Question q : InputOutput.loadQuestions()) {
            System.out.println(q.getA1());
            System.out.println(q.getA2());
            
            System.out.println(q.getA3());
            
            System.out.println(q.getA4());
        }
        System.out.println(InputOutput.loadQuestions().get(0));
        
        //InputOutput.QuestionIcon("Billede1.png");
        
        
    }
}
