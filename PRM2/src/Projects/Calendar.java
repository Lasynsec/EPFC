/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

/**
 *
 * @author herve
 */
public class Calendar {
    
    /**
     * Return a integer corresponding to the day of the week (0 = monday, 1 = tuesday, 2 = wednesday,etc.) for a given date in parameter.
     * The year in  parameter have to be in AAAA format(2008).
     * @param day
     * @param month
     * @param year
     * @return 
     */
    public static int dayOfWeek(int day, int month, int year){
        int dayOfWeekNumber = 0;
        return dayOfWeekNumber;
    }
    
    /**
     * Return the number of days in the given month in parameter.
     * @param month
     * @param year
     * @return 
     */
    public static int daysInMonth(int month, int year){
        int numberOfDaysInAMonth = 0;
        return numberOfDaysInAMonth;
    }
    
    /**
     * Receive a year un the AAAA format and return true if the year is leap otherwise false.
     * @param year
     * @return 
     */
    public static boolean isLeapYear(int year){
        boolean isLeap = true;
        return true;
    } 
    
    /**
     * Display the number of the given day in parameter (JJ = 01).
     * @param day 
     */
    public static void printDay(int day){
        System.out.println("the day");
    }
    
    /**
     * Display the calendar of the given month in parameter. Weeks start on Monday.
     * @param month
     * @param year 
     */
    public static void printCalendar(int month, int year){
  
    }
    
    public static void main(String[] args) {
        
    }
    
}
