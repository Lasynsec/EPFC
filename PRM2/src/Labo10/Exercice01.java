/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo10;

import eu.epfc.prm2.Array;

/**
 *
 * @author 2207hembilo
 */
public class Exercice01 {    
    public static int getArraySum(Array<Integer> tab){
        int sumArray = 0;
        for(int i = 0; i < tab.size(); ++i){
            sumArray += tab.get(i);
        }
        return sumArray;
    }
        public static void main(String[] args) {
            Array<Integer> tab = new Array<>(10,10,10,10,10,10); 
            System.out.println(getArraySum(tab));
        }
}
