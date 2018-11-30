/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the value to look for : ");
        int val = scan.nextInt();

        int userInt;
        int cpt = 1;
        int lastvaluePosition = 0;
        boolean numbersAretheSame = false;

        do {
            System.out.print("Type the value number " + cpt + " : ");
            userInt = scan.nextInt();

            if (userInt == val) {
                lastvaluePosition = cpt;
                numbersAretheSame = true;
            }
                ++cpt;
        } while (userInt != -1);
        
        if(numbersAretheSame){
            System.out.println("The search value is in the position number " + lastvaluePosition);
        }else{
            System.out.println("The search value is not in this series " + lastvaluePosition);
        }
        
    }
}
