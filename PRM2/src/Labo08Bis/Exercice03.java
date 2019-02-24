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
        int nbrOfPlateLastMaxValue = 0;
        SeqIntIterator it = s.iterator();
        
        if(it.hasNext()){
            int currentValue = it.next();
            int maxValue = currentValue;
            while(it.hasNext()){
                int precValue = currentValue;
                currentValue = it.next();               
                    if(currentValue >= maxValue) {
                        maxValue = currentValue;
                        nbrOfPlateLastMaxValue = 0;
                    }else if(currentValue != precValue){
                        ++nbrOfPlateLastMaxValue;
                    }
            }
        }
        return nbrOfPlateLastMaxValue;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(500,21,1,850,11,5,750,750,5);
        System.out.println(nbrOfPlateAfterLastMaxValue(s));
    }
}

/**
 N°                    |1  |2  |3 |4|5 |6 |7  |8  |9  |
--------------------------------------------------
Seq                    |500|21 |1 |1|11|5 |750|750|5  |
--------------------------------------------------
CurValue               |500|21 |1 |1|11|5 |750|750|5  | -> currentValue = it.next();
--------------------------------------------------
precValue              |   |500|21|1|1 |11|5  |750|750| -> precValue = currentValue;
--------------------------------------------------
maxValue               |500| ""|""|"|""|""|750|"" |"" | -> if(currentValue > currentMaxValue) currentMaxValue = currentValue;countNbOfPlate = 0;
--------------------------------------------------
nbrOfPlateLastMaxValue |   |1  |2 |2|3 |4 |1  |1  |2  | -> if(currentValue != precValue) ++nbrOfPlateLastMaxValue;

 */