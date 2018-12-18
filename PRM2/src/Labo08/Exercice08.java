/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import java.util.Scanner;
import seqint.SeqInt;
import seqint.SeqIntIterator;

/**
 *
 * @author 2207hembilo
 */
public class Exercice08 {
        public static int firstValuePosition(SeqInt s, int n){
        SeqIntIterator it = s.iterator();
        int count = 0;
        int positionTarget = 0;
        
        if(!it.hasNext()){
            throw new IllegalArgumentException("La sequence est vide");
        }
        
        while (it.hasNext()) {
            ++count;
            if(it.next() == n){
                 positionTarget = count;
            }
        }
    return positionTarget;         
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tye a number : ");
        int userInput = scan.nextInt();
        
        SeqInt s = new SeqInt(1,2,3,4,5,4,6);
        
        System.out.println(firstValuePosition(s, userInput));
    }
}
