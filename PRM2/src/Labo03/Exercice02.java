/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo03;

import java.util.Scanner;

/**
 *
 * @author 2207hembilo
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the number of value two caculate : ");
        int nbrOfValues = scan.nextInt();
        int k = 0;
        double valuesToCalulate = 0;
        
        while(k < nbrOfValues) {
            System.out.print("Type the value number " + (k+1) +" : ");
            valuesToCalulate += scan.nextInt();
            ++k;
        }
        double average = valuesToCalulate/nbrOfValues;
        System.out.println("The average is " + average);
    }
}
