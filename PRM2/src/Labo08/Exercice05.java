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
public class Exercice05 {

    public static double average(SeqInt s) {
        int sum = 0;
        int count = 0;
        SeqIntIterator it = s.iterator();

        while (it.hasNext()) {
            sum += it.next();
            ++count;
        }

        double avg = (sum/count);
        
        return avg;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(8,8,8,8,8);
        System.out.println(average(s));
    }
}
