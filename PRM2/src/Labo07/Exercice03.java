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
    
public static boolean isHeaven(int nbr)
{
    boolean evenOrOdd;
    if(nbr % 2 == 0){
        evenOrOdd = true;
    }else{
        evenOrOdd = false;
    }
    return evenOrOdd;
}

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int userInput = scan.nextInt();
    /*  
    if(isHaven(userInput)){
        System.out.println("Is even");
    }*/
}
}
