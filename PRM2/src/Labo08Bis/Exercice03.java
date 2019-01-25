/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08Bis;

import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author 2207hembilo
 */
public class Exercice03 {
    public static int nbrOfPlateAfterLastMaxValue(SeqInt s){
        int nbrOfPlateLastMValue = 0;
        SeqIntIterator it = s.iterator();
        int positionMax = 0;
        
        if(it.hasNext()){
            int currentValue = it.next();
            int maxValue = currentValue;
            int nbrOfPlate = 0;
            int position = 1;
            while(it.hasNext()){
                int precValue = currentValue;
                currentValue = it.next();
                
                if (currentValue != precValue) {
                    if (currentValue >= maxValue) {
                        maxValue = currentValue;
                    }
                }
                

                ++position;
            }
        }
        return positionMax;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(500,2,1,1,1,11,5,750,750,750,7,8,2,9);
        System.out.println(nbrOfPlateAfterLastMaxValue(s));
    }
}
