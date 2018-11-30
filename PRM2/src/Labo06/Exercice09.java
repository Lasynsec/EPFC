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
public class Exercice09 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the value to look for : ");        
        int val = scan.nextInt();
        
        int userInt;
        int cpt = 1;
        int valuePosition = 0;
        
        do{
          System.out.print("Type the value number " + cpt + " : ");
          userInt = scan.nextInt();
          
          if(userInt == val){
              valuePosition = cpt;
              System.out.println("The value is in the position number " + valuePosition);
          }else if(userInt == -1){
              System.out.println("The search value is not in this series");
          } else {
               ++cpt;
          }
        }while(userInt != val && userInt != -1);
    }
}
