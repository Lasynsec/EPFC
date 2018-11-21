/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpt = 1;
        System.out.print("Type the value numbner " + cpt + " : ");
        int userInput = scan.nextInt();
        int max = userInput;
        int min = userInput;
        
        do{
            ++cpt;
            System.out.print("Type the value number " + cpt + " : ");
            userInput = scan.nextInt();
            if(userInput > max && userInput != 0){
                max = userInput;
          }else if(userInput < min && userInput != 0){
                min = userInput;
          }
        }while(userInput != 0);
        
        System.out.println("the min is "  + min + "the max is" + max);
    }
}
