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
public class Exercice03 {
    
    public static int getMaximum(int nbrOne,int nbrTwo){
        
        int theMax = 0;
        if(nbrOne > nbrTwo){
            theMax = nbrOne;
        } else {
            theMax = nbrTwo;
        }
        return theMax;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the frist number : ");
        int userInputOne = scan.nextInt();
        
        System.out.print("Type the second number : ");
        int userInputTwo = scan.nextInt();
        
        System.out.println("The greater of both numbers is " + getMaximum(userInputOne, userInputTwo));
        
    }    
}
