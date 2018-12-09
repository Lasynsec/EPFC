/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo05;

import java.util.Scanner;
/**
 *
 * @author herve
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfValue;
        do{
            System.out.print("Please type the number of values : ");
            numberOfValue = scan.nextInt();
            
            if(numberOfValue < 0){
                System.out.println("Your number must be greater than 0");
            }
        }while(numberOfValue < 0);
        
        int userValue;
        int count = 1;
        double additionOfvalues = 0;
        
        do{
            System.out.print("Type the value number (" + count + ") : " );
            userValue = scan.nextInt();
            
            additionOfvalues += userValue;
            ++count;
        }while(count <= numberOfValue);
        
        System.out.println(additionOfvalues/numberOfValue);
    }
}
