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
        int nbrPlate = 0;
        int nbrPlateOfTree = 0;
        int nbrOfElementInPlate = 0;
        if (it.hasNext()) {
            int currentValue = it.next();
            while (it.hasNext()) {
                int precValue = currentValue;
                currentValue = it.next();

                if (currentValue == precValue) {
                    ++nbrOfElementInPlate;
                    System.out.println(nbrOfElementInPlate + ":" + currentValue);
                   
                }else {
                    nbrOfElementInPlate = 1;
                }
            }
        }
        return nbrPlateOfTree;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,1,1,2,3,4,3,3,3,1,1,1,2,2,2,4,5,5,5);
        System.out.println(nbrPlateGreaterOrEqualToThree(s));
    }
}
