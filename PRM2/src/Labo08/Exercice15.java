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
public class Exercice15 {
    public static SeqInt getTheMaxAndMin(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        if(!it.hasNext()){
             throw new IllegalArgumentException("The list is empty");
        }
        
        int theMaximum = it.next();
        int theMinimum = theMaximum;
        while (it.hasNext()) {
            int currentValue = it.next();
            if(currentValue < theMinimum){
                theMinimum = currentValue;
            }else if(currentValue > theMaximum){
                theMaximum = currentValue;
            }
        }
        
        SeqInt MaxAndMin = new SeqInt(theMinimum,theMaximum);
        
        return MaxAndMin;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,5,300,40,5000,60000);
        System.out.println(getTheMaxAndMin(s));
    }
}
