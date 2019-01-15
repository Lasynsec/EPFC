/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import static Labo08.Exercice15.getTheMaxAndMin;
import seqint.SeqInt;
import seqint.SeqIntIterator;
/**
 *
 * @author herve
 */
public class Exercice16 {
    public static SeqInt getTheMaxValues(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        int maxValueOne = it.next();
        int maxValueTwo = 0;
        
        if(!it.hasNext()){
             throw new IllegalArgumentException("The list is empty");
        }
        while(it.hasNext()){
            int currentValue = it.next();
            if(currentValue > maxValueOne){
                    maxValueTwo = maxValueOne;               
                    maxValueOne = currentValue;   
                    System.out.println("Test1");
            }else if (currentValue > maxValueTwo && maxValueTwo < maxValueOne){
                maxValueTwo = currentValue;
                System.out.println("Test2");
            }
        }
        //--------------------------Test
        System.out.println(maxValueOne);
        System.out.println(maxValueTwo);
        
        SeqInt theTwoMax = new SeqInt(maxValueOne,maxValueTwo);
        
        return theTwoMax;
    }
    
    public static void main(String[] args) {
        //SeqInt s = new SeqInt(10,5,30,80,50,1000);
        SeqInt s = new SeqInt(3,6,4,6,2,-8);        
        System.out.println(getTheMaxValues(s));
    }
}
