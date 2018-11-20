/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;

/**
 *
 * @author 2207hembilo
 */
public class Exercice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int old = 0;
        int recent = 1;
        int fiboCalc = 0;

        System.out.print("Type a number of fibo : ");
        int nbrFibo = scan.nextInt();
        
        int i = 0;
        while(fiboCalc < nbrFibo){
            fiboCalc = recent + old;
            old = recent;
            recent = fiboCalc;
            i++;
            if(fiboCalc < nbrFibo){
                 System.out.println(fiboCalc);
            }
        }
        //System.out.println(fiboCalc);
    }
}
