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
public class Exercice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the limit number : ");
        int limitNumber = scan.nextInt();
        int k = 0;
        int sumOfInputs = 0;
        
        while(sumOfInputs < limitNumber){
            ++k;
            sumOfInputs += k;
        }
        
        System.out.println("The sum is "+ k);
    }
}
