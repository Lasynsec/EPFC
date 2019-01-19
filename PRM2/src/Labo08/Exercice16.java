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
    public static SeqInt getTwoMaxValues(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        int maxValueOne = it.next();
        int maxValueTwo = 0;
        
        while(it.hasNext()){
            int currentValue = it.next();
            if(currentValue > maxValueOne){
                maxValueTwo = maxValueOne;               
                maxValueOne = currentValue;
            }else if (currentValue > maxValueTwo && maxValueTwo < maxValueOne && currentValue != maxValueOne){
                maxValueTwo = currentValue;
                System.out.println(maxValueTwo);
            }
        }
        
        SeqInt getMaxValues = new SeqInt(maxValueOne,maxValueTwo);
        
        return getMaxValues;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(500,500,500,2,50);
        
        System.out.println(getTwoMaxValues(s));
    }
}
