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
public class Exercice09 {
    public static boolean prime(int nbr){
        boolean isPrime = false;
        boolean getOut = false;
        int count = 1;
        
        do{
            ++count;
            //System.out.println(Exercice08.multiple(nbr, count));
            if(Exercice08.multiple(nbr, count)){
                getOut = true;
            }
        }while(!getOut);
        
        if(nbr == count){
            isPrime = true;
        }

        return isPrime;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nbrOne;
        do{       
            System.out.print("Type the number one : ");
            nbrOne = scan.nextInt();
            
            if(nbrOne < 1){
                System.out.println("Your number must be greater than 1");
            }

        }while(nbrOne < 1);

        System.out.println(prime(nbrOne));
    }
}
