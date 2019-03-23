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
public class Exercice02 {
    public static double getAverageOfArrayValues(Array<Integer> tab){
        return (double) Labo10.Exercice01.getArraySum(tab)/tab.size();
    }
    public static void main(String[] args) {
        Array<Integer> tab =  new Array<>(5,6,7,8,2);
        System.out.println(getAverageOfArrayValues(tab));
    }
}
