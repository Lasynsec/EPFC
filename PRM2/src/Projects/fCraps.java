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
public class fCraps {
            public static final Random generator = new Random();
            public static final Scanner scan = new Scanner(System.in);
            
    public static int throwDice(){
        return generator.nextInt(6)+1;
    }
    
    public static void displayDices(int diceOne, int diceTwo){
        System.out.println("You have thrown " + diceOne + " and " + diceTwo + ". The sum is " + (diceOne+diceTwo));
    }
    
    public static int bet(int nbrChips){
        int userBet;
         System.out.println("You have " + nbrChips +" chips***");
        do{
             System.out.print("How much chips do you want to bet ? (Type 0 to stop the game) : ");
             userBet = scan.nextInt();            
             if(userBet < 0 || userBet > nbrChips){
                 System.out.println("Hey ! You are trying to scam the Casino. Re-bet !\n");
             }
        }while(userBet < 0 || userBet > nbrChips); 
        
        return userBet;
    }
    
    public static boolean playAndWinAScrapsTurn() {
        int diceOne = 0;
        int diceTwo = 0;
        int SumOfDices = 0;
        int theGoal = 0;
        int nbrChips = 10;
        boolean stopTheGame = false;
        int roundNumber = 0;
        boolean youLoose;
    
        diceOne = throwDice();
        diceTwo = throwDice();
        
        SumOfDices = diceOne + diceTwo;
        displayDices(diceOne, diceTwo);
        
        if (SumOfDices == 7 || ((SumOfDices == 2 || SumOfDices == 3 || SumOfDices == 12) && (roundNumber == 1))) {
            System.out.println("You lose !");
            youLoose = false;
        } else {
            if (roundNumber == 1 && (SumOfDices == 7 || SumOfDices == 11) || theGoal == SumOfDices) {
                System.out.println("You win !");
                youLoose = true;
            }
        }
        
        theGoal = SumOfDices;
        System.out.println("The goal is " + theGoal);
        
        return stopTheGame;
}
    public static void main(String[] args) {

        System.out.println("==========================");
        System.out.println("Welcome to the craps game");
        System.out.println("==========================");
      
        //userBet = bet(nbrChips);
        playAndWinAScrapsTurn();
        
        
    }
}
