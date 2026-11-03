/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L100204;

import java.util.Scanner;

/**
 *
 * @author alisd
 */
public class L100204Q4 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDayOfYear = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Days in each month (Index 0 = Jan, 1 = Feb, ..., 7 = August)
        int[] daysInMonths = {
            31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        // Calculate total days passed from Jan 1 up to the start of May (Months 0 to 3: Jan, Feb, Mar, Apr)
        int totalDaysToMay = 0;
        for (int i = 0; i < 4; i++) {
            totalDaysToMay += daysInMonths[i];
        }
        int firstDayOfMay = (firstDayOfYear + totalDaysToMay) % 7;
        
        // Calculate total days passed from Jan 1 up to the start of August (Months 0 to 6: Jan to July)
        int totalDaysToAugust = 0;
        for (int i = 0; i < 7; i++) {
            totalDaysToAugust += daysInMonths[i];
        }
        int firstDayOfAugust = (firstDayOfYear + totalDaysToAugust) % 7;
        
        // Display May Calendar
        printMonthCalendar("May", daysInMonths[4], firstDayOfMay);
        
        // Display August Calendar
        printMonthCalendar("August", daysInMonths[7], firstDayOfAugust);
    }
    
    public static void printMonthCalendar(String monthName, int totalDays, int startDay) {
        System.out.println("\n------------ " + monthName + " ------------");
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        
        // Print spacing for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("     ");
        }
        
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%-5d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n----------------------------------");
    }
}
