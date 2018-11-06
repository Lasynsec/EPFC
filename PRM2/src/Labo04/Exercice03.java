/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo04;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice03 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the number of values : ");
        int nbrOfValues = scan.nextInt();
        
        int sumOfValues = 0;
        for(int i = 1; i <= nbrOfValues; ++i){
            
            System.out.print("Type the value number " + i + " : ");
            sumOfValues += scan.nextInt();
        }
        
        System.out.println("The average is " + (double)(sumOfValues / nbrOfValues));
    }
}
