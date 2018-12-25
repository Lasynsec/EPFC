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
    public static int getDifferenceOfMaxValues(SeqInt s){
        SeqIntIterator it = s.iterator();
        
        int maxValueOne = it.next();
        int maxValueTwo = 0;
        int currentValue;
        while(it.hasNext()){
            currentValue = it.next();
            if(currentValue > maxValueOne){
                maxValueTwo = maxValueOne;               
                maxValueOne = currentValue;
            }else if (currentValue > maxValueTwo && maxValueTwo < maxValueOne){
                maxValueTwo = currentValue;
            }
        }
        
        //SeqInt MaxAndMin = new SeqInt(maxValueOne,maxValueTwo);
        
        return maxValueOne - maxValueTwo;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(10,5,30,80,50,1000);
        
        System.out.println(getDifferenceOfMaxValues(s));
    }
}
