/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author herve
 */
public class Exercice10 {
    public static boolean hasDublicatedValue(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        boolean getOut = false;
        
        int precedingValue = it.next();
        while(it.hasNext() && getOut == false){
            int currentValue = it.next();
            
            if(currentValue == precedingValue){
                getOut = true;
            }
            precedingValue = currentValue;
        }
        
        boolean hasDoubloon = false;
        
        if(getOut){
          hasDoubloon = true;  
        }
        return hasDoubloon;
    }
    public static void main(String[] args) {
        
        SeqInt s = new SeqInt(1,2,3,4,3,6);
        
        System.out.println(hasDublicatedValue(s));
        
    }
}
