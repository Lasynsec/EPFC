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
public class Exercice08 {
    public static boolean multiple(int nbrOne, int nbrTwo){
        boolean result = false ;
        
        if(nbrOne % nbrTwo == 0){
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the number one : ");
        int nbrOne = scan.nextInt();
        
        System.out.print("Type the number two : ");
        int nbrTwo = scan.nextInt();
        
        System.out.println(multiple(nbrOne, nbrTwo));
    }
}
