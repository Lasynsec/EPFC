/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2.Labo2;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice18 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the first number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Type the second number : ");
        int secondNumber = scan.nextInt();
        
        
        if(-firstNumber > secondNumber && firstNumber < 0 ){
            System.out.println("negatif");
        } else if(firstNumber < 0 && secondNumber < 0){
            System.out.println("negatif");
        } else {
           System.out.println("positif");
        }
    }
}
