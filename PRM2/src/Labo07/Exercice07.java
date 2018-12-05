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
public class Exercice07 {
    public static int factorial(int nbr){
        int result = 1;
        for(int i = 1; i <= nbr; ++i){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number : " );
        int userNbr = scan.nextInt();
        
        System.out.println(factorial(userNbr));
        
    }
}
