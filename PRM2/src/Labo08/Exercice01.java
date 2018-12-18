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
public class Exercice01 {
    
    public static boolean isEmpty(SeqInt s){
        SeqIntIterator it = s.iterator();
        boolean seqIsEmpty;
        return !it.hasNext();
    }
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5,2);
        System.out.println(isEmpty(s));
    }
}
