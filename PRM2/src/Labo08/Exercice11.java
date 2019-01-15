/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import seqint.SeqInt;
import seqint.SeqIntIterator;
import sun.print.resources.serviceui;
/**
 *
 * @author herve
 */
public class Exercice11 {
    public static int lastPositionMaxValue(SeqInt s){
       SeqIntIterator it = s.iterator();
       
       int currentValue;
       int position = 0;
       int count = 1;
     
       int theMax = it.next();
       while(it.hasNext()){
           ++count;
           currentValue = it.next();           
           if(currentValue >= theMax){
               theMax = currentValue;
               position = count;
           }
       }
       return position;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,12,3,6,9,10,10);
        
        System.out.println(lastPositionMaxValue(s));
    }
}
