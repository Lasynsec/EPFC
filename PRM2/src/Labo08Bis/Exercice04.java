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
public class Exercice04 {

    public static int nbrPlateGreaterOrEqualToThree(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int nbrPlateOfTreeOrMore = 0;
        int sizeOfCurrentPlate = 1;
        if (it.hasNext()) {
            int currentValue = it.next();
            while (it.hasNext()) {
                int precValue = currentValue;
                currentValue = it.next();
                
                if(precValue == currentValue){
                    ++sizeOfCurrentPlate;
                }else {
                    sizeOfCurrentPlate = 1;
                }
                
                if(sizeOfCurrentPlate == 3){
                    ++nbrPlateOfTreeOrMore;
                }/*else if(sizeOfCurrentPlate == 4){
                    --nbrPlateOfTreeOrMore;
                }*/            
            }
        }
        return nbrPlateOfTreeOrMore;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,1,1,2,3,4,3,3,3,1,1,1,2,2,2,4,5,5,5);
        System.out.println(nbrPlateGreaterOrEqualToThree(s));
    }
}

/**
 N°                    |1  |2  |3 |4|5 |6 |7  |8  |9  |
--------------------------------------------------
Seq                    |1  |1  |1 |2 |3|4|3|3|3|1|1|1|2|2|2|4|5|5|5
--------------------------------------------------
CurValue               |500|21 |1 |1|11|5 |750|750|750  | -> currentValue = it.next();
--------------------------------------------------
precValue              |   |500|21|1|1 |11|5  |750|750| -> precValue = currentValue;
--------------------------------------------------
nbrOfSameValue         |   |1  |1 |2|1 |1 |1  |2  |3  | -> if(currentValue == precValue) ++nbrOfSameValue; else nbrOfSameValue = 1;
* --------------------------------------------------
nbrPlateOfTreeOrMore   |   |0  |0 |0|0 |0 |0  |0  |1  | -> if(nbrOfSameValue >= 3) ++nbrPlateOfTreeOrMore;
 */