/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author herve
 */
public class Craps {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("==========================");
        System.out.println("Welcome to the craps game");
        System.out.println("==========================");
        
        int nbrChips = 10;
        boolean stopTheGame = false;
        boolean reachTheGoal = false;
        int userBet = 0;
        int diceOne = 0;
        int diceTwo = 0;
        int SumOfDices = 0;
        int roundNumber = 1;
        int theGoal = 0;
        
        do{             
            System.out.println("You have " + nbrChips +" chips ");
            System.out.print("How much chips do you want to bet ? (Type 0 to stop the game) : ");
            userBet = scan.nextInt();
            
            if (userBet < 0) {
               System.out.println(" Hey ! You are trying to scam the Casino. Re-bet !");
               System.out.println(" ");
            } else {
                diceOne = generator.nextInt(11)+1;
                diceTwo = generator.nextInt(11)+1;
                SumOfDices = diceOne + diceTwo;

                System.out.println("You have thrown " + diceOne + " and " + diceTwo + ". The sum is " + SumOfDices);

                if (userBet == 0) {
                    System.out.println("Good bye !");
                    stopTheGame = true;
                } else if (nbrChips <= 0 || SumOfDices == 7 || ((SumOfDices == 2 || SumOfDices == 3 || SumOfDices == 12) && (roundNumber == 1))) {
                    System.out.println("You lose !");
                    stopTheGame = true;
                } else {
                    if (roundNumber == 1 && (SumOfDices == 7 || SumOfDices == 11) || theGoal == SumOfDices){
                        System.out.println("You win !");
                        nbrChips *= 2;
                    } else {
                         nbrChips -= userBet;
                         if (nbrChips <= 0) {
                            System.out.println("You lose !");
                             stopTheGame = true;
                         }
                    }
                    
                    theGoal = SumOfDices;
                    System.out.println("The goal is " + theGoal);
                    ++roundNumber;
                }
                System.out.println(" ");
            }
        }while(!stopTheGame );
        
    }
}
