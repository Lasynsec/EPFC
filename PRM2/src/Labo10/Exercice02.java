/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo10;
import static Labo10.Exercice01.getArraySum;
import eu.epfc.prm2.Array;

/**
 *
 * @author 2207hembilo
 */
public class Exercice02 {
   public static double getAverageInArray(Array<Integer> tab){
       
       int sumElement = 0;
       for(int i = 0; i < tab.size();++i){
           sumElement += tab.get(i);
       }
       System.out.println("Tab size"+tab.size());
       return sumElement / tab.size();
   } 
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(10,10,10,10,10,10); 
        System.out.println(getAverageInArray(tab));
    }
}
