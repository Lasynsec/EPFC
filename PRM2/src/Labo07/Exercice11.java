/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo07;

import java.util.Scanner;
/**
 *
 * @author herve
 */
public class Exercice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a number to draw the square : ");
        int userNbr = scan.nextInt();
        
        for(int i = 0; i < userNbr; ++i){
            for(int j = 1; j <userNbr; ++j){
                System.out.print("X ");
            }
            System.out.println("X");
        }
    }
}
