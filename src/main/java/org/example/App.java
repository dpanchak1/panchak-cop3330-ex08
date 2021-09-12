/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("How many people? ");
        int people=input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas=input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices=input.nextInt();

        int totalSlices=pizzas*slices;
        int slicesPerPerson=totalSlices/people;
        int leftover=totalSlices%people;

        System.out.printf("%d people with %d pizzas (%d slices)%n",people,pizzas,totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n",slicesPerPerson);
        System.out.printf("There are %d leftover pieces.",leftover);

    }
}
