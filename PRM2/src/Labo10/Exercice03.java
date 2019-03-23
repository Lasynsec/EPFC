/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo10;

import eu.epfc.prm2.Array;

/**
 *
 * @author herve
 */
public class Exercice03 {
    public static boolean isInArray(Array<Integer> tab, int userInput){
        int i = 0,res = 0;
        boolean inArray = false;
        while(i<=tab.size()-1 && tab.get(i) != userInput){
            res = i;
            i++;
        }
        
        if(res<tab.size()-1){inArray = true;}
        
        return inArray;
    }
    
    public static boolean isInArrayB(Array<Integer> tab, int userInput,int startPosition){
        int i = startPosition,res = 0;
        boolean inArray = false;
        
        if(i>tab.size()-1){
            throw new IllegalArgumentException("The start point must be lower than tab.size()-1");
        }
        
        while(i<=tab.size()-1 && tab.get(i) != userInput){
            res = i;
            i++;
        }
        
        if(res<tab.size()-1){inArray = true;}
        
        return inArray;
    }
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(3,7,5,4,8);
        boolean result = isInArray(tab, 7);
        boolean result2 = isInArrayB(tab, 4,2);
        if(result2){
            System.out.println("The value is in the array");
        }else{
            System.out.println("The value is not in the array");
        }
    }
    
}
