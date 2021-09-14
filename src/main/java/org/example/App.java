/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is your current age? " );
        int currentAge = Integer.parseInt( scan.nextLine() );

        System.out.print( "At what age would you like to retire? " );
        int retireAge = Integer.parseInt( scan.nextLine() );

        int year = Calendar.getInstance().get( Calendar.YEAR );
        int retireTime = retireAge - currentAge;

        System.out.println( "You have " + retireTime + " years left until you can retire.");
        System.out.println( "It's " + year + ", so you can retire in " + (year + retireTime) + ".");
    }
}
