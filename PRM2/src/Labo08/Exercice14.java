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
public class Exercice14 {
    public static int theLargestNegativeNumber(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        if(!it.hasNext()){
             throw new IllegalArgumentException("The list is empty");
        }
        
        int largestNegativeNumber = it.next();
        int currentValue;
        
        while(it.hasNext()){
            currentValue = it.next();            
                if(currentValue >= 0){
                     throw new IllegalArgumentException("The sequence must only have negative numbers");
                }           
            if(currentValue < largestNegativeNumber){
                largestNegativeNumber = currentValue;
            }
        }
        return largestNegativeNumber;
    }
    public static void main(String[] args) {
        //SeqInt s = new SeqInt(-2,-3,-65,-36,-40);
        SeqInt s = new SeqInt();
        System.out.println(theLargestNegativeNumber(s));
    }
}
