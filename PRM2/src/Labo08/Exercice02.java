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
public class Exercice02 {
    public static int getLength(SeqInt s){
        int length = 0;
        SeqIntIterator it = s.iterator();
        
        while (it.hasNext()) {
            ++length;
            it.next();
        }
        
        return length;
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5,6,7,8,9,5);
        
        System.out.println(getLength(s));
    }
}
