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

    /**
     * Will generate and return a random value between 1 and 6.
     *
     * @return return the random value.
     */
    public static int shootDice() {
        return generator.nextInt(6) + 1;
    }

    /**
     * Will display the dices values.
     *
     * @param diceOne
     * @param diceTwo
     */
    public static void displayDices(int diceOne, int diceTwo) {
        System.out.println("You have thrown " + diceOne + " and " + diceTwo + ". The sum is " + (diceOne + diceTwo));
    }

    /**
     * Ask for the number of chips to bets.
     *
     * @param nbrChips
     * @return
     */
    public static int bet(int nbrChips) {
        int userBet;
        System.out.println("You have " + nbrChips + " chips***");
        do {
            System.out.print("How many chips do you want to bet ? (Type 0 to stop the game) : ");
            userBet = scan.nextInt();
            if (userBet < 0 || userBet > nbrChips) {
                System.out.println("Hey ! You are trying to scam the Casino. Re-bet !\n");
            }
        } while (userBet < 0 || userBet > nbrChips);

        return userBet;
    }

    /**
     *
     * @param shootNbr,sumOfDices
     * @return
     */
    public static int checkDicesRoll(int shootNbr, int sumOfDices, int target) {
        boolean heWin = true;
        int dicesRollResult;
        if ((sumOfDices == 7 && shootNbr > 1) || ((sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) && (shootNbr == 1))) {
            dicesRollResult = 0;
        } else if (shootNbr == 1 && (sumOfDices == 7 || sumOfDices == 11) || (shootNbr > 1 && sumOfDices == target)) {
            dicesRollResult = 1;
        } else {
            dicesRollResult = 2;
        }
        return dicesRollResult;
    }

    /**
     *
     * @return
     */
    public static boolean playAndWinAScrapsToss() {
        boolean heWin = true;
        int diceTwo;
        int diceOne;
        int SumOfDices;
        int count = 1;
        int targetToReach = 0;
        int resultDicesRoll = 0;
        
        do {
            diceOne = shootDice();
            diceTwo = shootDice();

            SumOfDices = diceOne + diceTwo;
            //SumOfDices = 11;

            displayDices(diceOne, diceTwo);
            
            resultDicesRoll = checkDicesRoll(count, SumOfDices,targetToReach);
            
            if (count == 1 && resultDicesRoll == 2) {
                targetToReach = SumOfDices;
                System.out.println("The target is : " + targetToReach);
            }

            if (resultDicesRoll == 1) {
                heWin = true;
            } else if (resultDicesRoll == 0) {
                heWin = false;
            }        
            ++count;
            
        } while (resultDicesRoll == 2);

        return heWin;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("==========================");
        System.out.println("Welcome to the craps game V2.0");
        System.out.println("==========================");

        int nbrChips = 10;
        int userBet;
        boolean stopTheGame = false;
        
        do{
            userBet = bet(nbrChips);
            //System.out.println("User bet : " + userBet);
            
            if (userBet > 0 && nbrChips > 0) {
                if (playAndWinAScrapsToss()) {
                    nbrChips *= 2;
                    System.out.println("You win !");
                } else {
                    nbrChips -= userBet;
                    System.out.println("You loose !");
                }
            }else {
                System.out.println("Good bye !!!");
            }          
        }while(userBet > 0 && nbrChips > 0);
    }
}
