/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author 2207hembilo
 */
public class Exercice03 {
    
    public static int addingMachine(SeqInt s){
        int sum = 0;
        SeqIntIterator it = s.iterator();
        
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5,6,7,8,9,5);
        
        System.out.println(addingMachine(s));
               
    }
}
