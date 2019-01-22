/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08Bis;
import static Labo08Bis.Exercice01.nbrOfPlate;
import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author 2207hembilo
 */
public class Exercice02 {
    public static int nbrOfPrecFirsMaxPlate(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int nbrPlateBeforeMax = 0;
        int nbPlate = 0;
        int maxValue = 0;
        if (it.hasNext()) {
            int currentValue = it.next();
            maxValue = currentValue;
            while (it.hasNext()) {
                int precValue = currentValue;
                currentValue = it.next();
                
                if (currentValue != precValue) {
                    ++nbPlate;
                }
                
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                    nbrPlateBeforeMax = nbPlate;
                }
            }
        }
        return nbrPlateBeforeMax;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(500,2,1,1,1,11,5,750,70,7,7,8,2,9);        
        System.out.println(nbrOfPrecFirsMaxPlate(s));
    }
}
