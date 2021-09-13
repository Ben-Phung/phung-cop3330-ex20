
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double tax;
        double taxRate;

        // Prompt user
        System.out.print( "What is the order amount? " );
        String Amount = scan.nextLine();

        System.out.print( "What state do you live in? " );
        String State = scan.nextLine();

        double dAmount = Double.parseDouble(Amount);

        // Calculating different Wisconsin county taxes and outputting Wisconsin
        if (State.equals( "Wisconsin" ))
        {
            taxRate = 0.05;
            System.out.print("What county do you live in? ");
            String county = scan.nextLine();

            if (county.equals("Eau Claire"))
            {
                taxRate = taxRate + 0.005;
            }
            else if (county.equals("Dunn"))
            {
                taxRate = taxRate + 0.004;
            }

            tax = taxRate * dAmount;
            dAmount = dAmount + tax;

            System.out.println( "The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f",dAmount) + "." );
        }
        // Illinois calculations
        else if (State.equals( "Illinois" ))
        {
            taxRate = 0.08;
            tax = taxRate * dAmount;
            dAmount = dAmount + tax;

            System.out.println( "The tax is $" +String.format("%.2f",tax) + ".\nThe total is $" +String.format("%.2f",dAmount) + "." );
        }
    }
}