/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import java.time.Clock;
import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice04 {
    public static int nbrOfApparition(SeqInt s, int nbrToFind){
        SeqIntIterator it = s.iterator();
        int nbrApparition = 0;
        
        while(it.hasNext()){
            if(it.next() == nbrToFind){
                ++nbrApparition;
            }
        }
        
        return nbrApparition;
    }
    
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        SeqInt s = new SeqInt(1,2,3,4,5,5,5,5);
        
        System.out.print("Type a number : ");
        int userInput = scan.nextInt();
        
        System.out.println(nbrOfApparition(s, userInput));
    }
}
