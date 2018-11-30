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
public class Exerice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type your number : ");
        int userInt = scan.nextInt();
        
        int old = 0;
        int current = 1;
        int fibAdd = 0;
        int count = 1;
        boolean isInFiboSeries = false;
     
        do{
            
            fibAdd = old + current;
            old = current;
            current = fibAdd;
            
            if(current == userInt){
                isInFiboSeries = true;
            }
            
        }while(current <= userInt);
        
        if(isInFiboSeries){
            System.out.println("The number is in the fibinacci sequence");
        } else {
            System.out.println("The number is not in the fibinacci sequence");
        }
    }
}
