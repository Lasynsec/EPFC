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
 * @author 2207hembilo
 */
public class Exercice09 {
    
    public static boolean areAscendingNumbers(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        boolean getOut = false;
        int precedingValue = it.next();
        
        while(it.hasNext() && getOut == false){
            int currentValue = it.next();
            if(currentValue < precedingValue){
                getOut = true;
            }
            precedingValue = currentValue;
        }
        
        boolean areAscending;
        
        if(getOut){
            areAscending = false;
        } else {
            areAscending = true;
        }
        return areAscending;
    }
    
    public static void main(String[] args) {
        SeqInt s = new SeqInt(2,2,3,1,5);
        
        System.out.println(areAscendingNumbers(s));
    }
    
}
