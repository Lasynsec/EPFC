/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.util.Scanner;


/**
 *
 * @author herve
 */
public class Calendar {

    /**
     * Return a integer corresponding to the day of the week (0 = monday, 1 =
     * tuesday, 2 = wednesday,etc.) for a given date in parameter. The year in
     * parameter have to be in AAAA format(2008).
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static int dayOfWeek(int day, int month, int year) {
        double equationMonth = ((month+1)*13)/5;
        int dayOfWeekNumber = (day+(((month+1)*13)/5)+ (year % 100) + ((year % 100)/4) + ((year/100)/4) + 5*(year/100)) % 7;
            
        return dayOfWeekNumber;
    }
     /**
     * Receive a year un the AAAA format and return true if the year is leap
     * otherwise false.
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeap = true;
        }

        return isLeap;
    }

    /**
     * Return the number of days in the given month in parameter.
     *
     * @param month
     * @param year
     * @return
     */
    public static int daysInMonth(int month, int year) {
        int numberOfDaysInAMonth = 0;
        if (month == 13 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            numberOfDaysInAMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numberOfDaysInAMonth = 30;
        } else {            
            if(month == 14){
                ++year;
            }
            
            if (isLeapYear(year)) {
                numberOfDaysInAMonth = 29;
            } else {
                numberOfDaysInAMonth = 28;
            }
        }

        return numberOfDaysInAMonth;
    }

    /**
     * Display the number of the given day in parameter (JJ = 01).
     *
     * @param day
     */
    public static void printDay(int day) {
        if(day < 32){            
            if(day < 10){
                System.out.print("0"+day+"   ");
            }else {
                System.out.print(day+"   ");
            }
        }
    }
    public static int convertFromZellerDay(int startingDay){
        int result = 0;
        if(startingDay > 1 && startingDay < 7){
            result = startingDay - 2;
        } else if(startingDay == 0){
            result = 5;
        } else {
            result = 6;
        }
        
        return result;
    }
    
    public static int askForDayAndMonth(String yearOrMonth){
        int userInput;
        boolean isInputCorrect;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type an integer for the " + yearOrMonth + " : ");
        do{
            userInput = scan.nextInt();
            if(yearOrMonth == "month" && (userInput <= 0 || userInput > 14)){
                System.out.print("Please type a number greater than 0 and lower than 15 for the month : ");
                isInputCorrect = false;
            }else if(yearOrMonth == "year" && userInput < 1){
                System.out.print("Please type a number greater than 0 for the day : ");
                isInputCorrect = false;
            }else{
                isInputCorrect = true;
            }    
        }while(!isInputCorrect);
        
        
        return userInput;
    }
    
    /**
     * 
     * @param month
     * @return boolean;
     */
    public static boolean isJanuaryOrFebruary(int month){
        boolean isJanOrFeb = false;
        if(month == 1 || month == 2){
            isJanOrFeb = true;
        }
        return isJanOrFeb;
    }

    /**
     * Display the calendar of the given month in parameter. Weeks start on
     * Monday.
     *
     * @param month
     * @param year
     */
    public static void printCalendar(int month, int year) {
        String wordMonth = "January";
        switch (month) {
            case 2:
                wordMonth = "February";
                break;
            case 3:
                wordMonth = "March";
                break;
            case 4:
                wordMonth = "April";
                break;
            case 5:
                wordMonth = "May";
                break;
            case 6:
                wordMonth = "June";
                break;
            case 7:
                wordMonth = "july";
                break;
            case 8:
                wordMonth = "August";
                break;
            case 9:
                wordMonth = "September";
                break;
            case 10:
                wordMonth = "October";
                break;
            case 11:
                wordMonth = "November";
                break;
            case 12:
                wordMonth = "December";
        }

        System.out.println("================================");
        System.out.println(wordMonth + " " + year);
        System.out.println("================================");
        System.out.println("Mon  Tues Wed Thurs Fri  Sat Sun");
        
        if(isJanuaryOrFebruary(month)){
            month += 12;
            --year; 
        }
        
        int startingDay = dayOfWeek(1,month,year);
        int count = 0;
        int nbrOfWeekLine = 6;
        
        if(startingDay == 1 || startingDay == 0 || daysInMonth(month, year) == 28){
            nbrOfWeekLine = 5;
        }
        //System.out.println(daysInMonth(month, year)+"/"+nbrOfWeekLine);
        int numberOfDaysInMonth = daysInMonth(month, year);
        for (int i = 0; i < numberOfDaysInMonth/nbrOfWeekLine; ++i) {
            for (int j = 0; j < 7; ++j) {
                if (j < convertFromZellerDay(startingDay) && i == 0) {
                    System.out.print("     ");
                } else {
                    if(count < numberOfDaysInMonth){
                        printDay(++count);
                    }
                    
                }
            }
            System.out.println("");
        }

        System.out.println("================================");
    }

    public static void main(String[] args) {
        int year = askForDayAndMonth("year");
        int month = askForDayAndMonth("month");
        printCalendar(month,year);
        
    }
}
