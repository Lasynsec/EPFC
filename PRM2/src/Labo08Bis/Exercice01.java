/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08Bis;
import static Labo08.Exercice02.getLength;
import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author 2207hembilo
 */
public class Exercice01 {
    public static int nbrOfPlate( SeqInt s){
        int nbPlate = 1;
        SeqIntIterator it = s.iterator();
        if(it.hasNext()){
            int currentValue = it.next();
            while (it.hasNext()) {                
                int prec = currentValue;
                currentValue = it.next();             
                if(currentValue != prec){
                    ++nbPlate;
                }
            }
        }
        return nbPlate;
    } 
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5,6,6,8,9,5,9,3,3,6,7,8,8,8);
        
        System.out.println(nbrOfPlate(s));
    }
}
