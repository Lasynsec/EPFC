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
public class Exercice06 {
    public static int theGreatest(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        if(!it.hasNext()){
            throw new IllegalArgumentException("La sequence est vide");
        }
        
       int theMax = it.next();     
        while (it.hasNext()) {
            int nextValue = it.next();
            if(theMax < nextValue){
               theMax = nextValue;
            }           
        }
        return theMax;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt();
        
        System.out.println(theGreatest(s));
    }
}
