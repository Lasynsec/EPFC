/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo07;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice05 {
    
    public static int multiplication(int nbrOne, int nbrTwo){
        int result = 0;
        boolean resultIsnegative = false;
        int minus;
        
        if(nbrOne < 0 && nbrTwo >= 0){
            nbrOne = -nbrOne;
            resultIsnegative = true;
        }else if(nbrTwo < 0 && nbrOne >= 0){
            nbrTwo = -nbrTwo;
            resultIsnegative = true;
        }else if(nbrTwo < 0 && nbrOne < 0){
            nbrTwo = -nbrTwo;
            nbrOne = -nbrOne;
        }
        
        for(int count = 0; count < nbrOne; ++count){
            result += nbrTwo;
        }
        
        if(resultIsnegative){
            minus = -1;
        }else {
            minus = 1;
        }
        return minus * result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the first number : ");
        int userInputOne = scan.nextInt();
        System.out.print("Type the first number : ");
        int userInputTwo = scan.nextInt();
        
        System.out.println("The result of " + userInputOne + " * " + userInputTwo + " = " + multiplication(userInputOne, userInputTwo));        
    }
}
