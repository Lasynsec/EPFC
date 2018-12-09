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
public class Exercice10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int userNbr;
        
        do{
            System.out.print("Type a number greater than one : ");
            userNbr = scan.nextInt();
            
            if(userNbr < 2){
                System.out.println("Please type a number greater than 0");
            }
        }while(userNbr < 2);
        
        int countPrime = 0;
        for(int count = 2; count < userNbr; ++count){
            if(Exercice09.prime(count)){
                ++countPrime;
            }
        }
        
        System.out.println("Until the number " + userNbr + " There is " + countPrime + " prime number");
    }
}
