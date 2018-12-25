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
public class Exercice12 {
    
     public static int firstPositionMaxValue(SeqInt s){
       SeqIntIterator it = s.iterator();
       
       int currentValue;
       int position = 0;
       int count = 1;
       int oneTimeMax = 0;
     
       int theMax = it.next();
       boolean getOut = false;
       while(it.hasNext() && getOut == false){
           ++count;
           currentValue = it.next();           
           if(currentValue >= theMax){
               if(currentValue != theMax){
                   theMax = currentValue;
                   position = count;
               }
           }
       }
       return position;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,12,3,24,9,12,24);
        
        System.out.println(firstPositionMaxValue(s));
    }
}
